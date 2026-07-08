package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.util.Map;

/* JADX INFO: renamed from: X.1DUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2256611DUd extends AbstractC873650YPb {
    public final String LIZIZ;
    public final boolean LIZJ;
    public final Map<String, String> LIZLLL;
    public final BaseShortVideoContext LJ;
    public final C0Y3I LJFF;
    public C1DUQ LJI;
    public final C2256701DUm LJII;
    public final C2256741DUq LJIIIIZZ;

    /* JADX WARN: Removed duplicated region for block: B:75:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0260  */
    @Override // X.AbstractC873650YPb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(final X.C873910YQb r29, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r30) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2256611DUd.LIZ(X.0YQb, X.05Vn):java.lang.Object");
    }

    public static void LIZJ(C873910YQb c873910YQb, C0YRX c0yrx, C873900YQa c873900YQa) {
        C0YS1.LIZJ("PublishPhotoStep", "publish params ready");
        c873910YQb.LIZJ = c0yrx;
        C869590Y9l c869590Y9l = c873910YQb.LIZ;
        if (c869590Y9l != null) {
            c869590Y9l.getExt().put("a:media_task_id", c869590Y9l.getUuid());
        }
        c873910YQb.LIZLLL = c873900YQa;
    }

    public C2256611DUd(String str, boolean z, Map<String, String> map, BaseShortVideoContext baseShortVideoContext, C0Y3I c0y3i, C1DUQ c1duq, C2256701DUm c2256701DUm, C2256741DUq c2256741DUq) {
        super("camera-publish-photo");
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = map;
        this.LJ = baseShortVideoContext;
        this.LJFF = c0y3i;
        this.LJI = c1duq;
        this.LJII = c2256701DUm;
        this.LJIIIIZZ = c2256741DUq;
    }
}
