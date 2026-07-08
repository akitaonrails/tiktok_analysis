package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.AlbumAiContentServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535050Kyd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AlbumAiContentServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535050Kyd(AlbumAiContentServiceImpl albumAiContentServiceImpl, String str, String str2) {
        super(0);
        this.LL = albumAiContentServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<C535020Kya> listLJFF;
        AlbumAiContentServiceImpl albumAiContentServiceImpl = this.LL;
        C534910KyP c534910KyP = albumAiContentServiceImpl.LIZIZ;
        String strLIZ = this.LLILLJJLI;
        String strLIZ2 = this.LLILLL;
        boolean z = this.LLILZ;
        synchronized (c534910KyP) {
            try {
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateNewFlag: ");
                sbLIZ.append(strLIZ);
                sbLIZ.append(',');
                sbLIZ.append(strLIZ2);
                sbLIZ.append(',');
                sbLIZ.append(z);
                C201955140j.LIZLLL(c552700Lm0, "AlbumAiContentServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                if (strLIZ != null) {
                    listLJFF = albumAiContentServiceImpl.LIZIZ.LJ(strLIZ);
                } else if (strLIZ2 != null) {
                    listLJFF = albumAiContentServiceImpl.LIZIZ.LJFF(strLIZ2);
                }
                if (!listLJFF.isEmpty()) {
                    C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateNewFlag: ");
                    sbLIZ2.append(listLJFF.size());
                    sbLIZ2.append(',');
                    sbLIZ2.append(listLJFF);
                    C201955140j.LIZLLL(c533790Kwb, "AlbumAiContentServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    for (C535020Kya c535020Kya : listLJFF) {
                        if (c535020Kya.LJIIIZ != z) {
                            albumAiContentServiceImpl.LIZIZ.LIZIZ(C535020Kya.LIZ(c535020Kya, 0, 0, 0, null, z, 0, 65023));
                        }
                    }
                } else {
                    if (strLIZ == null) {
                        strLIZ = C1017903yT.LIZ();
                    }
                    if (strLIZ2 == null) {
                        strLIZ2 = C1017903yT.LIZ();
                    }
                    C535020Kya c535020Kya2 = new C535020Kya(strLIZ, strLIZ2, 0, 0, 0, 0, null, null, z, null, null, null, 0L, 65016);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("updateNewFlag fake: ");
                    sbLIZ3.append(c535020Kya2);
                    C201955140j.LIZLLL(c552700Lm0, "AlbumAiContentServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    albumAiContentServiceImpl.LIZIZ.LIZIZ(c535020Kya2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }
}
