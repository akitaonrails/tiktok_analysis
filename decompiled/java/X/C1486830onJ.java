package X;

/* JADX INFO: renamed from: X.0onJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486830onJ {
    public static final C1486820onI LIZ = new InterfaceC1486840onK() { // from class: X.0onI
        @Override // X.InterfaceC1486840onK
        public final void onChanged(Object obj) {
            if (obj instanceof String) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onChanged:");
                String str = (String) obj;
                sbLIZ.append(str);
                C1720106oR.LJI("PlaybackPreloadAdapter", C2188811AlT.LIZIZ(sbLIZ));
                C1478160oZK.LIZ().LJJJJIZL(31228, str);
            }
        }
    };
}
