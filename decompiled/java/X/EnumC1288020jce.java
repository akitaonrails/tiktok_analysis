package X;

/* JADX INFO: renamed from: X.0jce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1288020jce {
    Idle,
    Success,
    Failure;

    public static final C1288030jcf Companion = new Object() { // from class: X.0jcf
    };

    public static EnumC1288020jce valueOf(String str) {
        return (EnumC1288020jce) C08FF.LIZ(EnumC1288020jce.class, str);
    }

    public final EnumC1288040jcg into() {
        int i = C1288010jcd.LIZ[ordinal()];
        if (i == 1) {
            return EnumC1288040jcg.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_IDLE;
        }
        if (i == 2) {
            return EnumC1288040jcg.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_SUCCESS;
        }
        if (i == 3) {
            return EnumC1288040jcg.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_FAILURE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1288010jcd.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new C1954807lC();
    }
}
