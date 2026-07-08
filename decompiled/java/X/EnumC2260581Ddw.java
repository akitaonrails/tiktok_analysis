package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Ddw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2260581Ddw {
    public static final /* synthetic */ EnumC2260581Ddw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2260581Ddw TEXT_TO_IMAGE_CAMERA;
    public static final EnumC2260581Ddw TEXT_TO_IMAGE_GALLERY;
    public final AbstractC2260591Ddx LL;

    public static InterfaceC2044707zh<EnumC2260581Ddw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2260581Ddw enumC2260581Ddw = new EnumC2260581Ddw("TEXT_TO_IMAGE_CAMERA", 0, new AbstractC2260591Ddx() { // from class: X.1Ddy
            /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
            {
                /*
                    r11 = this;
                    X.1De2 r3 = new X.1De2
                    r0 = 14
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r2 = X.C814420VxA.LIZIZ(r0)
                    r0 = 7
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r1 = X.C814420VxA.LIZIZ(r0)
                    r0 = 2131100549(0x7f060385, float:1.7813483E38)
                    r3.<init>(r2, r1, r0)
                    r0 = 4
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r8 = X.C814420VxA.LIZIZ(r0)
                    r0 = 5
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r9 = X.C814420VxA.LIZIZ(r0)
                    r7 = 2131100549(0x7f060385, float:1.7813483E38)
                    X.01GW r0 = X.C04R2.LIZ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r1 = r0.intValue()
                    if (r1 == 0) goto L86
                    r0 = 1
                    if (r1 != r0) goto L7f
                    r10 = 2131821546(0x7f1103ea, float:1.9275838E38)
                L54:
                    X.1De0 r5 = new X.1De0
                    r6 = 52
                    r5.<init>(r6, r7, r8, r9, r10)
                    X.1De1 r4 = new X.1De1
                    r0 = 8
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r2 = X.C814420VxA.LIZIZ(r0)
                    r0 = 52
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    float r1 = X.C418440Gaw.LIZIZ(r0)
                    r0 = 2131100546(0x7f060382, float:1.7813477E38)
                    r4.<init>(r2, r0, r1)
                    r11.<init>(r3, r5, r4)
                    return
                L7f:
                    r0 = 2
                    if (r1 != r0) goto L86
                    r10 = 2131821548(0x7f1103ec, float:1.9275842E38)
                    goto L54
                L86:
                    r10 = 2131821547(0x7f1103eb, float:1.927584E38)
                    goto L54
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2260601Ddy.<init>():void");
            }
        });
        TEXT_TO_IMAGE_CAMERA = enumC2260581Ddw;
        EnumC2260581Ddw enumC2260581Ddw2 = new EnumC2260581Ddw("TEXT_TO_IMAGE_GALLERY", 1, new AbstractC2260591Ddx() { // from class: X.1Ddz
            {
                new C2260641De2(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)), R.attr.a1h);
                new C2260621De0(72, R.attr.a1h, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 2131821550);
                new C2260631De1(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), R.attr.a03, C418440Gaw.LIZIZ(200));
            }
        });
        TEXT_TO_IMAGE_GALLERY = enumC2260581Ddw2;
        EnumC2260581Ddw[] enumC2260581DdwArr = {enumC2260581Ddw, enumC2260581Ddw2};
        LLILLJJLI = enumC2260581DdwArr;
        LLILLL = new C2254308sP(enumC2260581DdwArr);
    }

    public static EnumC2260581Ddw[] values() {
        return (EnumC2260581Ddw[]) LLILLJJLI.clone();
    }

    public final AbstractC2260591Ddx getUiConfig$tools_camera_record_release() {
        return this.LL;
    }

    public static EnumC2260581Ddw valueOf(String str) {
        return (EnumC2260581Ddw) C08FF.LIZ(EnumC2260581Ddw.class, str);
    }

    public EnumC2260581Ddw(String str, int i, AbstractC2260591Ddx abstractC2260591Ddx) {
        this.LL = abstractC2260591Ddx;
    }
}
