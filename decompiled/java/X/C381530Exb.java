package X;

/* JADX INFO: renamed from: X.0Exb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381530Exb {
    public static final void LIZ(Object obj) {
        C201955140j.LIZIZ("Template_Consume", String.valueOf(obj));
    }

    public static final void LIZIZ(InterfaceC538100L8m interfaceC538100L8m, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC538100L8m.getTaskName());
        sbLIZ.append(": isPreTask=");
        sbLIZ.append(interfaceC538100L8m.LJI());
        sbLIZ.append(", status=");
        sbLIZ.append(interfaceC538100L8m.getStatus());
        sbLIZ.append(", ");
        sbLIZ.append(obj);
        C201955140j.LIZIZ("Template_Consume", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final <INPUT, OUTPUT> void LIZJ(InterfaceC381510ExZ<INPUT, OUTPUT> interfaceC381510ExZ, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC381510ExZ.getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(obj);
        C201955140j.LIZIZ("Template_Consume", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZLLL(AbstractC538070L8j abstractC538070L8j, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC538070L8j.getTaskName());
        sbLIZ.append(": isPreTask=");
        sbLIZ.append(abstractC538070L8j.LJI());
        sbLIZ.append(", status=");
        sbLIZ.append(abstractC538070L8j.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(obj);
        C201955140j.LJFF("Template_Consume", C2188811AlT.LIZIZ(sbLIZ));
    }
}
