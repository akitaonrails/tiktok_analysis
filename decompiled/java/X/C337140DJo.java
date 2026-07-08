package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337140DJo implements C0DIX {
    public static final Set<String> LIZ = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void LIZJ(ImageView imageView) {
        int id = imageView.getId();
        if (id != -1) {
            try {
                String resourceEntryName = imageView.getResources().getResourceEntryName(id);
                if (resourceEntryName != null && !Intrinsics.LJFF(resourceEntryName, "iv_color_image") && !Intrinsics.LJFF(resourceEntryName, "iv_thumbnail")) {
                    Intrinsics.LJFF(resourceEntryName, "iv_mini_thumbnail");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static EnumC1338240kve LIZLLL(ImageView.ScaleType scaleType) {
        switch (C0DVW.LIZ[scaleType.ordinal()]) {
            case 1:
                return EnumC1338240kve.CENTER;
            case 2:
                return EnumC1338240kve.CENTER_CROP;
            case 3:
                return EnumC1338240kve.CENTER_INSIDE;
            case 4:
                return EnumC1338240kve.FIT_CENTER;
            case 5:
                return EnumC1338240kve.FIT_START;
            case 6:
                return EnumC1338240kve.FIT_END;
            case 7:
                return EnumC1338240kve.FIT_XY;
            case 8:
                return EnumC1338240kve.FIT_CENTER;
            default:
                throw new C1954807lC();
        }
    }

    public static String LJ(String str) {
        return C13LN.LJZL(24, a0.LJJLJ('/', str, str));
    }

    @Override // X.C0DIX
    public final void LIZ(final String str, final ImageView imageView, float f, final Function1<? super Boolean, Unit> function1) {
        int iLIZ;
        int iIntValue;
        Drawable colorDrawable;
        Animatable animatable;
        if (str.length() == 0) {
            return;
        }
        if (f <= 0.0f) {
            imageView.setClipToOutline(false);
            imageView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        } else {
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new C0IDA(f, 12));
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        imageView.setTag(R.id.ucp_image_model_url, str);
        imageView.setTag(R.id.ucp_image_url, str);
        imageView.setTag(R.id.ucp_image_start_time, Long.valueOf(jCurrentTimeMillis));
        Object tag = imageView.getTag(R.id.ucp_image_animatable);
        ArrayList arrayList = null;
        if ((tag instanceof Animatable) && (animatable = (Animatable) tag) != null) {
            animatable.stop();
        }
        imageView.setTag(R.id.ucp_image_animatable, null);
        imageView.animate().cancel();
        C786410Ut5.V4(imageView, 1.0f);
        if (imageView.getTag(R.id.ucp_image_scale_type) == null) {
            imageView.setTag(R.id.ucp_image_scale_type, imageView.getScaleType());
        }
        ImageView.ScaleType scaleType = (ImageView.ScaleType) imageView.getTag(R.id.ucp_image_scale_type);
        TypedValue typedValue = new TypedValue();
        imageView.getContext().getTheme().resolveAttribute(R.attr.a03, typedValue, true);
        int i = typedValue.type;
        if (28 <= i && i < 32) {
            iLIZ = typedValue.data;
        } else {
            iLIZ = C446980Hfs.LIZ(imageView.getContext(), typedValue.resourceId);
        }
        try {
            TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(imageView.getContext(), R.raw.icon_image_slash_fill);
            tuxIconDrawable.LJI(R.attr.a1k, imageView.getContext());
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            tuxIconDrawable.LJII(iLIZIZ);
            tuxIconDrawable.LJ(iLIZIZ);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(iLIZ), tuxIconDrawable});
            layerDrawable.setLayerGravity(1, 17);
            colorDrawable = layerDrawable;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, imageView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1118482;
            }
            colorDrawable = new ColorDrawable(iIntValue);
        }
        boolean zContains = LIZ.contains(str);
        if (zContains) {
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageDrawable(colorDrawable);
        } else {
            imageView.setScaleType(scaleType);
            imageView.setImageDrawable(new ColorDrawable(iLIZ));
        }
        C0D83 c0d83LIZIZ = C0D8X.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Fresco] load start view=");
        sbLIZ.append(imageView.getClass().getSimpleName());
        sbLIZ.append(" key=");
        sbLIZ.append(LJ(str));
        C2188811AlT.LIZIZ(sbLIZ);
        c0d83LIZIZ.d();
        LIZJ(imageView);
        List listLJIIJJI = C1697810uHb.LJIIJJI(1000L, 2000L, 3000L, 4000L, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL));
        boolean z = C0D48.LIZIZ().enableFrescoPostDelayedFix;
        if (z) {
            arrayList = new ArrayList();
        }
        final Drawable drawable = colorDrawable;
        Runnable runnable = new Runnable() { // from class: X.0DJl
            public final void LIZ() {
                Object tag2 = imageView.getTag(R.id.ucp_image_url);
                if (!(tag2 instanceof String)) {
                    tag2 = null;
                }
                Object tag3 = imageView.getTag(R.id.ucp_image_start_time);
                Long l = tag3 instanceof Long ? (Long) tag3 : null;
                if (Intrinsics.LJFF(tag2, str)) {
                    long j = jCurrentTimeMillis;
                    if (l == null || l.longValue() != j) {
                        return;
                    }
                    C0D83 c0d83LIZIZ2 = C0D8X.LIZIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Fresco] load timeout(");
                    sbLIZ2.append(20000L);
                    sbLIZ2.append("ms) view=");
                    sbLIZ2.append(imageView.getClass().getSimpleName());
                    sbLIZ2.append(" key=");
                    C337140DJo c337140DJo = this;
                    String str2 = str;
                    c337140DJo.getClass();
                    sbLIZ2.append(C337140DJo.LJ(str2));
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c0d83LIZIZ2.e();
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageDrawable(drawable);
                    imageView.setTag(R.id.ucp_image_url, null);
                    imageView.setTag(R.id.ucp_image_model_url, null);
                    C337140DJo.LIZ.add(str);
                    C337140DJo c337140DJo2 = this;
                    ImageView imageView2 = imageView;
                    c337140DJo2.getClass();
                    C337140DJo.LIZJ(imageView2);
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UcpFrescoImageLoaderImpl@6984.load$timeoutRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UcpFrescoImageLoaderImpl@6984.load$timeoutRunnable$1");
            }
        };
        if (arrayList != null) {
            arrayList.add(runnable);
        }
        HandlerHook.viewPostDelay(imageView, runnable, 20000L);
        if (z) {
            imageView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC346330Dhv(arrayList, 4));
        }
        LIZIZ(iLIZ, 0, jCurrentTimeMillis, 20000L, colorDrawable, scaleType, imageView, this, str, listLJIIJJI, arrayList, function1, zContains);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [long] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1] */
    public static final void LIZIZ(final int i, final int i2, final long j, final long j2, final Drawable drawable, final ImageView.ScaleType scaleType, final ImageView imageView, final C337140DJo c337140DJo, final String str, final List list, final List list2, Function1 function1, final boolean z) {
        Long l;
        Drawable colorDrawable;
        Object tag = imageView.getTag(R.id.ucp_image_url);
        if (!(tag instanceof String)) {
            tag = null;
        }
        Object tag2 = imageView.getTag(R.id.ucp_image_start_time);
        if (tag2 instanceof Long) {
            l = (Long) tag2;
        } else {
            l = null;
        }
        if (Intrinsics.LJFF(tag, str) && l != null) {
            final ?? LongValue = l.longValue();
            if (LongValue == j) {
                if (z) {
                    colorDrawable = drawable;
                } else {
                    colorDrawable = new ColorDrawable(i);
                }
                if (i2 > 0) {
                    colorDrawable = drawable;
                }
                try {
                    LongValue = function1;
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJIJL(imageView.getContext());
                    c1331670kl3LJIIIZ.LJJIIZI(colorDrawable);
                    EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER;
                    c1331670kl3LJIIIZ.LJIJ = drawable;
                    c1331670kl3LJIIIZ.LJIJI = enumC1338240kve;
                    c337140DJo.getClass();
                    c1331670kl3LJIIIZ.LJJ = LIZLLL(scaleType);
                    c1331670kl3LJIIIZ.LJJI(imageView);
                    c1331670kl3LJIIIZ.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0DJm
                        @Override // X.InterfaceC427850Gq7
                        public final void A3(Uri uri, C428600GrK c428600GrK) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void Bh(Uri uri, View view) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void e1(Uri uri) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void lg(Uri uri, Throwable th) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void cm(Uri uri, View view, Throwable th) {
                            Long l2;
                            String simpleName;
                            Object tag3 = imageView.getTag(R.id.ucp_image_url);
                            String message = null;
                            if (!(tag3 instanceof String)) {
                                tag3 = null;
                            }
                            Object tag4 = imageView.getTag(R.id.ucp_image_start_time);
                            if (tag4 instanceof Long) {
                                l2 = (Long) tag4;
                            } else {
                                l2 = null;
                            }
                            if (Intrinsics.LJFF(tag3, str)) {
                                long j3 = j;
                                if (l2 != null && l2.longValue() == j3) {
                                    long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                    if (i2 < list.size() && jCurrentTimeMillis < j2) {
                                        long jLongValue = ((Number) ListProtector.get(list, i2)).longValue();
                                        C0D83 c0d83LIZIZ = C0D8X.LIZIZ();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("[Fresco] load fail, retry in ");
                                        sbLIZ.append(jLongValue);
                                        sbLIZ.append("ms (attempt=");
                                        sbLIZ.append(i2 + 1);
                                        sbLIZ.append(") key=");
                                        C337140DJo c337140DJo2 = c337140DJo;
                                        String str2 = str;
                                        c337140DJo2.getClass();
                                        sbLIZ.append(C337140DJo.LJ(str2));
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        c0d83LIZIZ.d();
                                        final int i3 = i2;
                                        final ImageView imageView2 = imageView;
                                        final String str3 = str;
                                        final long j4 = j;
                                        final boolean z2 = z;
                                        final Drawable drawable2 = drawable;
                                        final int i4 = i;
                                        final C337140DJo c337140DJo3 = c337140DJo;
                                        final ImageView.ScaleType scaleType2 = scaleType;
                                        final Function1<Boolean, Unit> function12 = LongValue;
                                        final List<Long> list3 = list;
                                        final long j5 = j2;
                                        final List<Runnable> list4 = list2;
                                        Runnable runnable = new Runnable() { // from class: X.0DJn
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean zLIZ;
                                                C1C7U.LIZ("UcpFrescoImageLoaderImpl@6984.load$doRequest$1$onFailed$retryRunnable$1");
                                                try {
                                                    ImageView imageView3 = imageView2;
                                                    String str4 = str3;
                                                    long j6 = j4;
                                                    boolean z3 = z2;
                                                    Drawable drawable3 = drawable2;
                                                    int i5 = i4;
                                                    C337140DJo c337140DJo4 = c337140DJo3;
                                                    ImageView.ScaleType scaleType3 = scaleType2;
                                                    Function1<Boolean, Unit> function13 = function12;
                                                    List<Long> list5 = list3;
                                                    C337140DJo.LIZIZ(i5, i3 + 1, j6, j5, drawable3, scaleType3, imageView3, c337140DJo4, str4, list5, list4, function13, z3);
                                                } finally {
                                                    if (!zLIZ) {
                                                    }
                                                }
                                                C1C7U.LIZIZ("UcpFrescoImageLoaderImpl@6984.load$doRequest$1$onFailed$retryRunnable$1");
                                            }
                                        };
                                        if (list4 != null) {
                                            list4.add(runnable);
                                        }
                                        HandlerHook.viewPostDelay(imageView, runnable, jLongValue);
                                        return;
                                    }
                                    imageView.setTag(R.id.ucp_image_url, null);
                                    imageView.setTag(R.id.ucp_image_model_url, null);
                                    C0D83 c0d83LIZIZ2 = C0D8X.LIZIZ();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("[Fresco] display final fail view=");
                                    sbLIZ2.append(imageView.getClass().getSimpleName());
                                    sbLIZ2.append(" key=");
                                    C337140DJo c337140DJo4 = c337140DJo;
                                    String str4 = str;
                                    c337140DJo4.getClass();
                                    sbLIZ2.append(C337140DJo.LJ(str4));
                                    sbLIZ2.append(" msg=");
                                    if (th != null) {
                                        simpleName = th.getClass().getSimpleName();
                                    } else {
                                        simpleName = null;
                                    }
                                    sbLIZ2.append(simpleName);
                                    sbLIZ2.append(':');
                                    if (th != null) {
                                        message = th.getMessage();
                                    }
                                    sbLIZ2.append(message);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    c0d83LIZIZ2.e();
                                    C337140DJo.LIZ.add(str);
                                    C337140DJo c337140DJo5 = c337140DJo;
                                    ImageView imageView3 = imageView;
                                    c337140DJo5.getClass();
                                    C337140DJo.LIZJ(imageView3);
                                    Function1<Boolean, Unit> function13 = LongValue;
                                    if (function13 == null) {
                                        return;
                                    }
                                    function13.invoke(Boolean.FALSE);
                                }
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[PHI: r5
                          0x0062: PHI (r5v12 android.graphics.drawable.Animatable) = (r5v10 android.graphics.drawable.Animatable), (r5v13 android.graphics.drawable.Animatable) binds: [B:30:0x00c7, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // X.InterfaceC427850Gq7
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void Ad(android.net.Uri r9, android.view.View r10, X.C428600GrK r11, android.graphics.drawable.Animatable r12) {
                            /*
                                Method dump skipped, instruction units count: 209
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C337120DJm.Ad(android.net.Uri, android.view.View, X.0GrK, android.graphics.drawable.Animatable):void");
                        }
                    });
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (Intrinsics.LJFF(imageView.getTag(R.id.ucp_image_url), str) && Intrinsics.LJFF(imageView.getTag(R.id.ucp_image_start_time), Long.valueOf(j))) {
                        imageView.setImageDrawable(drawable);
                        imageView.setTag(R.id.ucp_image_url, null);
                        imageView.setTag(R.id.ucp_image_model_url, null);
                    }
                    C0D83 c0d83LIZIZ = C0D8X.LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Fresco] load exception view=");
                    sbLIZ.append(imageView.getClass().getSimpleName());
                    sbLIZ.append(" key=");
                    c337140DJo.getClass();
                    sbLIZ.append(LJ(str));
                    sbLIZ.append(" msg=");
                    sbLIZ.append(e.getClass().getSimpleName());
                    sbLIZ.append(':');
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                    c0d83LIZIZ.e();
                    LIZ.add(str);
                    LIZJ(imageView);
                    if (LongValue != 0) {
                        LongValue.invoke(Boolean.FALSE);
                    }
                }
            }
        }
    }
}
