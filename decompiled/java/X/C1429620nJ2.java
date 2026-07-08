package X;

/* JADX INFO: renamed from: X.0nJ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429620nJ2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1429610nJ1 LIZ(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1866128264:
                    if (str.equals("edit_prop")) {
                        return EnumC1429610nJ1.EDIT_PROP;
                    }
                    break;
                case -1751875015:
                    if (str.equals("effect_client")) {
                        return EnumC1429610nJ1.EDIT_EFFECT_CLIENT;
                    }
                    break;
                case -1299989071:
                    if (str.equals("effect_server")) {
                        return EnumC1429610nJ1.EDIT_EFFECT_SERVER;
                    }
                    break;
                case -510575962:
                    if (str.equals("combo_video_anim")) {
                        return EnumC1429610nJ1.EDIT_EFFECT_COMBO_ANIM;
                    }
                    break;
                case 41552559:
                    if (str.equals("in_video_anim")) {
                        return EnumC1429610nJ1.EDIT_EFFECT_IN_ANIM;
                    }
                    break;
                case 1307747558:
                    if (str.equals("out_video_anim")) {
                        return EnumC1429610nJ1.EDIT_EFFECT_OUT_ANIM;
                    }
                    break;
                case 1615936657:
                    if (str.equals("effect_combine")) {
                        return EnumC1429610nJ1.EDIT_EFFECT_COMBINED;
                    }
                    break;
                case 1620789606:
                    if (str.equals("edit_effect")) {
                        return EnumC1429610nJ1.EDIT_EFFECT;
                    }
                    break;
            }
            return EnumC1429610nJ1.EDIT_EFFECT;
        }
        return EnumC1429610nJ1.EDIT_EFFECT;
    }
}
