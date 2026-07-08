package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

/* JADX INFO: renamed from: X.0tKI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1661040tKI {
    public static final C1661050tKJ LIZIZ(C1661050tKJ c1661050tKJ, C1661050tKJ c1661050tKJ2) {
        String str = c1661050tKJ.LIZ;
        if (str == null) {
            str = c1661050tKJ2.LIZ;
        }
        MusicWaveBean musicWaveBean = c1661050tKJ.LIZIZ;
        if (musicWaveBean == null) {
            musicWaveBean = c1661050tKJ2.LIZIZ;
        }
        Integer num = c1661050tKJ.LIZJ;
        if (num == null) {
            num = c1661050tKJ2.LIZJ;
        }
        C202035143l c202035143l = c1661050tKJ.LIZLLL;
        if (c202035143l == null) {
            c202035143l = c1661050tKJ2.LIZLLL;
        }
        Effect effect = c1661050tKJ.LJ;
        if (effect == null) {
            effect = c1661050tKJ2.LJ;
        }
        Integer num2 = c1661050tKJ.LJFF;
        if (num2 == null) {
            num2 = c1661050tKJ2.LJFF;
        }
        ExceptionResult exceptionResult = c1661050tKJ.LJI;
        if (exceptionResult == null) {
            exceptionResult = c1661050tKJ2.LJI;
        }
        Boolean bool = c1661050tKJ.LJII;
        if (bool == null) {
            bool = c1661050tKJ2.LJII;
        }
        return new C1661050tKJ(str, musicWaveBean, num, c202035143l, effect, num2, exceptionResult, bool);
    }

    public static final void LIZ(C202033143j c202033143j, MusicModel musicModel, final C09AJ c09aj, final C11PR c11pr, boolean z) {
        if (!c202033143j.LIZIZ(musicModel, new InterfaceC202028143e() { // from class: X.0sZj
            @Override // X.InterfaceC202028143e
            public final void LIZIZ(Map map, Map map2) {
            }

            @Override // X.InterfaceC202028143e
            public final void onCancel() {
                c09aj.onNext(new C1661050tKJ(null, null, -108, null, null, null, null, null, 251));
                c09aj.onComplete();
            }

            @Override // X.InterfaceC202028143e
            public final void onStart() {
                if (C1632180sZk.LIZ) {
                    c11pr.onNext(new C1661140tKS(-100, -102, null, 0L, null, 28));
                }
            }

            @Override // X.InterfaceC202028143e
            public final void LIZJ(C202035143l c202035143l) {
                c09aj.onNext(new C1661050tKJ(null, null, -103, c202035143l, null, null, null, null, 243));
                c09aj.onComplete();
            }

            @Override // X.InterfaceC202028143e
            public final void onProgress(int i) {
                if (C1632180sZk.LIZ) {
                    c11pr.onNext(new C1661140tKS(-100, i, null, 0L, null, 28));
                }
            }

            @Override // X.InterfaceC202028143e
            public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
                c09aj.onNext(new C1661050tKJ(str, musicWaveBean, 100, null, null, null, null, null, 248));
                c09aj.onComplete();
            }
        }, true, true, z)) {
            c09aj.onNext(new C1661050tKJ(null, null, -103, new C202035143l(-1, "don`t start download music"), null, null, null, null, 243));
            c09aj.onComplete();
        }
    }
}
