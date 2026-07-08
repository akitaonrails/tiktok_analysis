package X;

/* JADX INFO: renamed from: X.0nS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435210nS3 extends AbstractC1446660nkW {
    public final AbstractC1433570nPP LJ;
    public final String LJFF;

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
    }

    public C1435210nS3(AbstractC1433570nPP abstractC1433570nPP, String str) {
        super(2, (Object) null);
        this.LJ = abstractC1433570nPP;
        this.LJFF = str;
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
        if (obj2 instanceof C1435310nSD) {
            C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
            C1435310nSD c1435310nSD = (C1435310nSD) obj2;
            c912070ZqH.LJIILLIIL().LJII().LIZ(this.LJFF).LJIILIIL(c912070ZqH.LJ().getFileSize(c1435310nSD.LIZ));
            this.LJ.onStageUpdate("STAGE_SYNTHETIC", new C1433370nP5(new C1433390nP7(new C0OPV(c1435310nSD.LIZ, c1435310nSD.LIZIZ, c1435310nSD.LIZJ))), null);
            return;
        }
        if (obj2 instanceof C1436050nTP) {
            this.LJ.onStageUpdate("STAGE_COVER_SYNTHETIC", new C1433370nP5(new C1433390nP7(((C1436050nTP) obj2).LIZ)), null);
        } else {
            if (!(obj2 instanceof C1435300nSC)) {
                return;
            }
            C1435300nSC c1435300nSC = (C1435300nSC) obj2;
            this.LJ.onStageUpdate("STAGE_FACE_DETECT_EVENT", new C1433370nP5(new C1433390nP7(new C912060ZqG(c1435300nSC.LIZ, c1435300nSC.LIZIZ))), null);
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        if (obj == EnumC1434770nRL.DM_VIDEO_UPLOAD_EVENT && (obj2 instanceof C1435240nS6) && obj2 != null) {
            this.LJ.onStageUpdate("STAGE_VIDEO_UPLOAD_EVENT", new C1433370nP5(new C1433390nP7(obj2)), null);
        }
    }
}
