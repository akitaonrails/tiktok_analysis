package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelReceiver;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortalInfoWithDisplay;
import com.bytedance.android.livesdk.livesetting.redenvelope.PortalPushIntoUIUpdate;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ejx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4$6", f = "PortalLeaf.kt", l = {}, m = "invokeSuspend")
public final class C1100350ejx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ EnvelopePortalMessage LLILZ;
    public final /* synthetic */ C1100380ek0 LLILZIL;
    public final /* synthetic */ C259800zU<Bitmap> LLILZLL;
    public final /* synthetic */ C259800zU<Bitmap> LLIZ;
    public final /* synthetic */ InterfaceC2365009Om LLIZLLLIL;
    public final /* synthetic */ C259800zU<View> LLJ;
    public final /* synthetic */ C259800zU<String> LLJI;
    public final /* synthetic */ C259800zU<String> LLJIJIL;
    public final /* synthetic */ C259800zU<ValueAnimator> LLJILJIL;
    public final /* synthetic */ C238400w2 LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100350ejx(C013C c013c, C013C c013c2, C013C c013c3, EnvelopePortalMessage envelopePortalMessage, C1100380ek0 c1100380ek0, C259800zU<Bitmap> c259800zU, C259800zU<Bitmap> c259800zU2, InterfaceC2365009Om interfaceC2365009Om, C259800zU<View> c259800zU3, C259800zU<String> c259800zU4, C259800zU<String> c259800zU5, C259800zU<ValueAnimator> c259800zU6, C238400w2 c238400w2, InterfaceC1364105Vn<? super C1100350ejx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c013c;
        this.LLILLJJLI = c013c2;
        this.LLILLL = c013c3;
        this.LLILZ = envelopePortalMessage;
        this.LLILZIL = c1100380ek0;
        this.LLILZLL = c259800zU;
        this.LLIZ = c259800zU2;
        this.LLIZLLLIL = interfaceC2365009Om;
        this.LLJ = c259800zU3;
        this.LLJI = c259800zU4;
        this.LLJIJIL = c259800zU5;
        this.LLJILJIL = c259800zU6;
        this.LLJILJILJ = c238400w2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1100350ejx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, android.graphics.Bitmap] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        T tCreateBitmap;
        T t;
        String str;
        int height;
        int width;
        int height2;
        int height3;
        String str2;
        Object obj2;
        String str3;
        C1C7U.LIZ("PortalLeaf@b89.notifyPortal$4$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = !this.LL.element ? 1 : 0;
        int i2 = !this.LLILLJJLI.element ? 1 : 0;
        int i3 = !this.LLILLL.element ? 1 : 0;
        EnvelopePortalMessage envelopePortalMessage = this.LLILZ;
        String str4 = "1";
        if (envelopePortalMessage != null) {
            boolean zLJJJJI = this.LLILZIL.LJJJJI();
            HashMap map = new HashMap(11);
            EnvelopePortalMessage.PortalInfo portalInfo = envelopePortalMessage.portalInfo;
            String str5 = "";
            if (portalInfo == null || (str2 = portalInfo.id) == null) {
                str2 = "";
            }
            map.put("portal_id", str2);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                map.put("room_id", idStr);
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            if (zLJJJJI) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_anchor", obj2);
            EnvelopePortalMessage.PortalInfo portalInfo2 = envelopePortalMessage.portalInfo;
            if (portalInfo2 != null && (str3 = portalInfo2.senderId) != null) {
                str5 = str3;
            }
            map.put("sender_id", str5);
            map.put("error_code", String.valueOf(i3));
            map.put("anchor_image_error_code", String.valueOf(i));
            map.put("cover_image_error_code", String.valueOf(i2));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_portal_load_lottie");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        }
        final C259800zU c259800zU = new C259800zU();
        C1100380ek0 c1100380ek0 = this.LLILZIL;
        Bitmap bitmap = this.LLILZLL.element;
        c1100380ek0.getClass();
        if (bitmap != null) {
            int width2 = bitmap.getWidth();
            int height4 = bitmap.getHeight();
            if (bitmap.getWidth() < bitmap.getHeight()) {
                height3 = bitmap.getWidth();
            } else {
                height3 = bitmap.getHeight();
            }
            float f = 192 / height3;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            tCreateBitmap = Bitmap.createBitmap(bitmap, (width2 - height3) / 2, (height4 - height3) / 2, height3, height3, matrix, true);
        } else {
            tCreateBitmap = 0;
        }
        c259800zU.element = tCreateBitmap;
        final C259800zU c259800zU2 = new C259800zU();
        C1100380ek0 c1100380ek02 = this.LLILZIL;
        Bitmap bitmap2 = this.LLIZ.element;
        c1100380ek02.getClass();
        if (bitmap2 != null) {
            if (bitmap2.getWidth() < bitmap2.getHeight()) {
                height = bitmap2.getWidth();
            } else {
                height = bitmap2.getHeight();
            }
            Matrix matrix2 = new Matrix();
            float f2 = 69 / height;
            matrix2.postScale(f2, f2);
            if (bitmap2.getWidth() < bitmap2.getHeight()) {
                width = 0;
            } else {
                width = (bitmap2.getWidth() - bitmap2.getHeight()) / 2;
            }
            if (bitmap2.getWidth() < bitmap2.getHeight()) {
                height2 = (bitmap2.getHeight() - bitmap2.getWidth()) / 2;
            } else {
                height2 = 0;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, width, height2, height, height, matrix2, true);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(69, 69, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            canvas.drawCircle(34.5f, 34.5f, 34.5f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
            t = bitmapCreateBitmap2;
        } else {
            t = 0;
        }
        c259800zU2.element = t;
        final C259800zU c259800zU3 = new C259800zU();
        C1100380ek0 c1100380ek03 = this.LLILZIL;
        int i4 = ((EnvelopPortalInfoWithDisplay) ListProtector.get(((EnvelopPortal4FEModelReceiver) this.LLIZLLLIL).portalInfos, 0)).portalInfo.envelopeDiamonds;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1100380ek03.LL), R.layout.hgw, null, false);
        TextView textView = (TextView) viewTd.findViewById(R.id.rie);
        if (textView != null) {
            textView.setGravity(3);
            textView.setText(String.valueOf(i4));
            textView.setTypeface(C1119920fFW.LIZJ(textView.getTextSize(), 500, textView.getContext()));
        }
        viewTd.measure(View.MeasureSpec.makeMeasureSpec(99, 1073741824), View.MeasureSpec.makeMeasureSpec(49, 1073741824));
        viewTd.layout(0, 0, viewTd.getMeasuredWidth(), viewTd.getMeasuredHeight());
        ?? CreateBitmap = Bitmap.createBitmap(viewTd.getWidth(), viewTd.getHeight(), Bitmap.Config.ARGB_8888);
        C842150X1x.LIZIZ(new Canvas(CreateBitmap), viewTd);
        c259800zU3.element = CreateBitmap;
        final C259800zU c259800zU4 = new C259800zU();
        C1100380ek0 c1100380ek04 = this.LLILZIL;
        View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(c1100380ek04.LL), R.layout.hgv, null, false);
        ((TextView) viewTd2.findViewById(R.id.rid)).setText(c1100380ek04.LL.getString(2131843845));
        viewTd2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(42, 1073741824));
        viewTd2.layout(0, 0, viewTd2.getMeasuredWidth(), viewTd2.getMeasuredHeight());
        ?? CreateBitmap2 = Bitmap.createBitmap(viewTd2.getWidth(), viewTd2.getHeight(), Bitmap.Config.ARGB_8888);
        C842150X1x.LIZIZ(new Canvas(CreateBitmap2), viewTd2);
        c259800zU4.element = CreateBitmap2;
        final C259800zU<View> c259800zU5 = this.LLJ;
        ((C1295960jpS) c259800zU5.element).addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.09oT
            @Override // X.InterfaceC1296230jpt
            public final void LIZ(C1294720jnS c1294720jnS) {
                Bitmap bitmap3 = c259800zU.element;
                if (bitmap3 != null) {
                    C259800zU<View> c259800zU6 = c259800zU5;
                    if (PortalPushIntoUIUpdate.INSTANCE.getValue()) {
                        ((C1295960jpS) c259800zU6.element).updateBitmap("image_9", bitmap3);
                    } else {
                        ((C1295960jpS) c259800zU6.element).updateBitmap("preview_image", bitmap3);
                    }
                }
                Bitmap bitmap4 = c259800zU3.element;
                if (bitmap4 != null) {
                    C259800zU<View> c259800zU7 = c259800zU5;
                    if (PortalPushIntoUIUpdate.INSTANCE.getValue()) {
                        ((C1295960jpS) c259800zU7.element).updateBitmap("image_5", bitmap4);
                    } else {
                        ((C1295960jpS) c259800zU7.element).updateBitmap("preview_text", bitmap4);
                    }
                }
                Bitmap bitmap5 = c259800zU2.element;
                if (bitmap5 != null) {
                    C259800zU<View> c259800zU8 = c259800zU5;
                    if (!PortalPushIntoUIUpdate.INSTANCE.getValue()) {
                        ((C1295960jpS) c259800zU8.element).updateBitmap("preview_avatar_image", bitmap5);
                    }
                }
                Bitmap bitmap6 = c259800zU4.element;
                if (bitmap6 != null) {
                    C259800zU<View> c259800zU9 = c259800zU5;
                    if (PortalPushIntoUIUpdate.INSTANCE.getValue()) {
                        ((C1295960jpS) c259800zU9.element).updateBitmap("image_3", bitmap6);
                    } else {
                        ((C1295960jpS) c259800zU9.element).updateBitmap("label", bitmap6);
                    }
                }
            }
        });
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(this.LLJI.element).buildUpon().appendQueryParameter("initial_data", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, this.LLIZLLLIL));
        if (!this.LLILZIL.LJJJJI()) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        InterfaceC1085330eLj interfaceC1085330eLjVd = ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Vd(this.LLILZIL.LL, builderAppendQueryParameter.appendQueryParameter("is_anchor", str4).build(), null, this.LLJIJIL.element, null, true);
        if (interfaceC1085330eLjVd != null) {
            InterfaceC2365009Om interfaceC2365009Om = this.LLIZLLLIL;
            C1100380ek0 c1100380ek05 = this.LLILZIL;
            EnvelopePortalMessage envelopePortalMessage2 = this.LLILZ;
            final C259800zU<View> c259800zU6 = this.LLJ;
            final C259800zU<ValueAnimator> c259800zU7 = this.LLJILJIL;
            final C013C c013c = this.LLILLL;
            final C238400w2 c238400w2 = this.LLJILJILJ;
            EnvelopPortal4FEModelReceiver envelopPortal4FEModelReceiver = (EnvelopPortal4FEModelReceiver) interfaceC2365009Om;
            if (envelopPortal4FEModelReceiver.portalInfos.size() > 0 && !Intrinsics.LJFF(((EnvelopPortalInfoWithDisplay) ListProtector.get(envelopPortal4FEModelReceiver.portalInfos, 0)).anchorId, String.valueOf(UserService.getInstance().user().getCurrentUserId())) && (str = c1100380ek05.LLJJIII) != null) {
                ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Ud(EnumC1101860emO.ID, str);
            }
            c1100380ek05.LLJJIII = interfaceC1085330eLjVd.dT1();
            ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Yd(interfaceC1085330eLjVd, new InterfaceC1101720emA() { // from class: X.0ejw
                @Override // X.InterfaceC1101720emA
                public final void LJLJL() {
                }

                @Override // X.InterfaceC1101720emA
                public final void LLLZI() {
                }

                @Override // X.InterfaceC1101720emA
                public final boolean Ur() {
                    return false;
                }

                @Override // X.InterfaceC1101720emA
                public final int Vr() {
                    return 0;
                }

                @Override // X.InterfaceC1101720emA
                public final View LLLILZJ() {
                    return c259800zU6.element;
                }

                @Override // X.InterfaceC1101720emA
                public final String Sr() {
                    return C1099470eiX.LIZ(this);
                }

                @Override // X.InterfaceC1101720emA
                public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
                    final C259800zU<ValueAnimator> c259800zU8 = c259800zU7;
                    final C013C c013c2 = c013c;
                    final C238400w2 c238400w22 = c238400w2;
                    return new InterfaceC1101940emW() { // from class: X.0ejv
                        @Override // X.InterfaceC1101940emW
                        public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                            return new AwS596S0100000_17(c259800zU8, (C259800zU<ValueAnimator>) 643);
                        }

                        @Override // X.InterfaceC1101940emW
                        public final void LIZIZ() {
                            ValueAnimator valueAnimator = c259800zU8.element;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                        }

                        @Override // X.InterfaceC1101940emW
                        public final void LIZJ() {
                            if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
                                IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
                                C1100340ejw c1100340ejw = this.LIZ;
                                c1100340ejw.getClass();
                                C1101820emK c1101820emKTd = iShortTouchService.Td(C1099470eiX.LIZ(c1100340ejw));
                                if (c1101820emKTd != null) {
                                    C013C c013c3 = c013c2;
                                    C238400w2 c238400w23 = c238400w22;
                                    c1101820emKTd.LIZJ = !c013c3.element ? 1 : 0;
                                    c1101820emKTd.LIZLLL = c238400w23.element;
                                }
                            }
                            ValueAnimator valueAnimator = c259800zU8.element;
                            if (valueAnimator != null) {
                                valueAnimator.start();
                            }
                        }

                        @Override // X.InterfaceC1101940emW
                        public final boolean isRunning() {
                            ValueAnimator valueAnimator = c259800zU8.element;
                            if (valueAnimator != null) {
                                return valueAnimator.isRunning();
                            }
                            return false;
                        }
                    };
                }
            });
            if (envelopePortalMessage2 != null) {
                C150500hr.LIZIZ(envelopePortalMessage2, c1100380ek05.LJJJJI());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PortalLeaf@b89.notifyPortal$4$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
