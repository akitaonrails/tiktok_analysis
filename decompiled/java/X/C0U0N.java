package X;

/* JADX INFO: renamed from: X.0U0N, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0U0N {
    public final String LIZ() {
        if ((this instanceof C0U0W) || (this instanceof C0U0U) || (this instanceof C0U12) || (this instanceof C765440U0w)) {
            return "queue_action";
        }
        if (this instanceof C0U13) {
            return "";
        }
        if (!(this instanceof C765450U0x)) {
            return this instanceof C0U0V ? String.valueOf(((C0U0V) this).LIZ) : "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C765450U0x c765450U0x = (C765450U0x) this;
        sbLIZ.append(c765450U0x.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(c765450U0x.LIZIZ.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
