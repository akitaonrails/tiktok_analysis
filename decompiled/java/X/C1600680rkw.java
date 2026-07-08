package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0rkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600680rkw {
    public static final C1600680rkw LIZ = new C1600680rkw();

    public static C486530J6d LIZLLL() {
        int i;
        boolean zLIZ = C295430Bi1.LIZ();
        int iLIZ = C1591480rW6.LIZ();
        if (!zLIZ && iLIZ != 2 && iLIZ != 3) {
            return null;
        }
        boolean z = false;
        if (iLIZ == 2) {
            i = zLIZ ? R.drawable.bux : R.drawable.buz;
        } else if (iLIZ == 3) {
            i = zLIZ ? R.drawable.buy : R.drawable.bv0;
        } else {
            if (!zLIZ) {
                return null;
            }
            i = R.raw.icon_live_entrance;
            z = true;
        }
        return new C486530J6d(i, z);
    }

    public static C486530J6d LJ() {
        int i;
        boolean zLIZ = C295430Bi1.LIZ();
        int iLIZ = C1591480rW6.LIZ();
        if (!zLIZ && iLIZ != 2 && iLIZ != 3) {
            return null;
        }
        boolean z = false;
        if (iLIZ == 2) {
            i = zLIZ ? R.drawable.bv2 : R.drawable.bv4;
        } else if (iLIZ == 3) {
            i = zLIZ ? R.drawable.bv3 : R.drawable.bv5;
        } else {
            if (!zLIZ) {
                return null;
            }
            i = R.raw.icon_magnifying_glass;
            z = true;
        }
        return new C486530J6d(i, z);
    }

    public static C1600670rkv LIZ(Context context) {
        int iLIZ;
        int iLIZ2;
        int i;
        int i2;
        int i3;
        C1600670rkv c1600670rkv = new C1600670rkv(context);
        c1600670rkv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iLIZ3 = C341940Daq.LIZ(16.0d);
        boolean zLIZ = C0C0H.LIZ();
        if (zLIZ) {
            iLIZ = C341940Daq.LIZ(15.0d);
            iLIZ2 = C341940Daq.LIZ(16.5d);
            iLIZ3 = C341940Daq.LIZ(13.5d);
        } else {
            iLIZ = iLIZ3;
            iLIZ2 = iLIZ3;
        }
        if (!C1581510rG1.LIZIZ()) {
            c1600670rkv.setPadding(iLIZ, iLIZ2, iLIZ, iLIZ3);
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (zLIZ) {
            i = 26;
        } else {
            i = 24;
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
        if (zLIZ) {
            i2 = 26;
        } else {
            i2 = 24;
        }
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
        if (zLIZ) {
            i3 = R.raw.icon_live_wave;
        } else {
            i3 = R.raw.icon_live;
        }
        c419910GdJ.LIZ = i3;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = true;
        c1600670rkv.setImageDrawable(c419910GdJ.LIZ(context));
        c1600670rkv.setCustomRiskId("old_liveicon");
        C2180521AVm.LIZLLL(c1600670rkv, 8, C1AV3.LIZ(1, "Feed", null, "top_generator"));
        return c1600670rkv;
    }

    public static TuxIconView LIZIZ(Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZ = R.raw.icon_magnifying_glass_offset;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = true;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C10VO.LIZJ(tuxIconView, 0.75f);
        tuxIconView.setTuxIcon(c419910GdJ);
        tuxIconView.setId(R.id.jqt);
        tuxIconView.setClickable(true);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iLIZ = C341940Daq.LIZ(56.0d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZ, iLIZ);
        layoutParams.setMargins(0, 0, 0, 0);
        C786410Ut5.M6(tuxIconView, layoutParams);
        InterfaceC435500H5w.LIZ.getClass();
        C435490H5v.LIZ();
        LIZ.getClass();
        LJFF(tuxIconView, "oldsearchicon");
        return tuxIconView;
    }

    public static TuxIconView LIZJ(Context context, C486530J6d c486530J6d) {
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (!c486530J6d.LIZIZ) {
            tuxIconView.setImageResource(c486530J6d.LIZ);
        } else {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZ = c486530J6d.LIZ;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setImageDrawable(c419910GdJ.LIZ(context));
        }
        double d = 56;
        C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(C341940Daq.LIZ(d), C341940Daq.LIZ(d)));
        return tuxIconView;
    }

    public static void LJFF(final TuxIconView tuxIconView, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAB_ICON/");
        sbLIZ.append(str);
        tuxIconView.setTag(R.id.emc, C2188811AlT.LIZIZ(sbLIZ));
        tuxIconView.setVisibilityListener(new InterfaceC420530GeJ() { // from class: X.0rkx
            @Override // X.InterfaceC420530GeJ
            public final void LIZLLL() {
                Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
                C2180551AVp.LIZ(EnumC2180541AVo.V_ANIMATE, tuxIconView, "");
            }

            @Override // X.InterfaceC420530GeJ
            public final void LIZJ(float f) {
                Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
                EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
                if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
                    return;
                }
                C2180551AVp.LIZ(enumC2180541AVo, tuxIconView, Float.valueOf(f));
            }

            @Override // X.InterfaceC420530GeJ
            public final void LJ(int i) {
                Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
                C2180551AVp.LIZ(EnumC2180541AVo.V_VISIBLITY, tuxIconView, Integer.valueOf(i));
            }
        });
    }
}
