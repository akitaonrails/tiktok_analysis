package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05Js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1333405Js {
    public static final EnumC1333405Js DESTROY;
    public static final EnumC1333405Js FIRST_FRAME_COMPLETE;
    public static final EnumC1333405Js IMMEDIATE_COMPLETE;
    public static final EnumC1333405Js IMMEDIATE_START;
    public static final EnumC1333405Js INIT;
    public static final /* synthetic */ EnumC1333405Js[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1333405Js RENDER_FIRST_FRAME;

    public static InterfaceC2044707zh<EnumC1333405Js> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1333405Js enumC1333405Js = new EnumC1333405Js("INIT", 0);
        INIT = enumC1333405Js;
        EnumC1333405Js enumC1333405Js2 = new EnumC1333405Js("IMMEDIATE_START", 1);
        IMMEDIATE_START = enumC1333405Js2;
        EnumC1333405Js enumC1333405Js3 = new EnumC1333405Js("IMMEDIATE_COMPLETE", 2);
        IMMEDIATE_COMPLETE = enumC1333405Js3;
        EnumC1333405Js enumC1333405Js4 = new EnumC1333405Js("RENDER_FIRST_FRAME", 3);
        RENDER_FIRST_FRAME = enumC1333405Js4;
        EnumC1333405Js enumC1333405Js5 = new EnumC1333405Js("FIRST_FRAME_COMPLETE", 4);
        FIRST_FRAME_COMPLETE = enumC1333405Js5;
        EnumC1333405Js enumC1333405Js6 = new EnumC1333405Js("DESTROY", 5);
        DESTROY = enumC1333405Js6;
        EnumC1333405Js[] enumC1333405JsArr = {enumC1333405Js, enumC1333405Js2, enumC1333405Js3, enumC1333405Js4, enumC1333405Js5, enumC1333405Js6};
        LL = enumC1333405JsArr;
        LLILLJJLI = new C2254308sP(enumC1333405JsArr);
    }

    public static EnumC1333405Js[] values() {
        return (EnumC1333405Js[]) LL.clone();
    }

    public static EnumC1333405Js valueOf(String str) {
        return (EnumC1333405Js) C08FF.LIZ(EnumC1333405Js.class, str);
    }

    public EnumC1333405Js(String str, int i) {
    }
}
