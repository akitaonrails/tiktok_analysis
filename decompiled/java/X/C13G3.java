package X;

/* JADX INFO: renamed from: X.13G3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13G3 {
    public static final void LIZ(String str, C13IQ c13iq) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("in the polymorphic scope of '");
        sbLIZ.append(c13iq.LJI());
        sbLIZ.append('\'');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Class discriminator was missing and no default serializers were registered ");
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append('.');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Serializer for subclass '");
            sbLIZ3.append(str);
            sbLIZ3.append("' is not found ");
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append(".\nCheck if class with serial name '");
            sbLIZ3.append(str);
            sbLIZ3.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            sbLIZ3.append(str);
            sbLIZ3.append("' has to be '@Serializable', and the base class '");
            sbLIZ3.append(c13iq.LJI());
            sbLIZ3.append("' has to be sealed and '@Serializable'.");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        throw new C19981113Fx(strLIZIZ);
    }
}
