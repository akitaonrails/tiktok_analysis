package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.AlbumSelectionRestoreComponent$onCreate$1$list$1$imageDeferred$1", f = "AlbumSelectionRestoreComponent.kt", l = {361}, m = "invokeSuspend")
public final class C527510KmT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public InterfaceC383701eN LLILLJJLI;
    public C527520KmU LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ InterfaceC383701eN LLIZLLLIL;
    public final /* synthetic */ C527520KmU LLJ;
    public final /* synthetic */ List<TikTokMediaModel> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527510KmT(List<String> list, Context context, InterfaceC383701eN interfaceC383701eN, C527520KmU c527520KmU, List<TikTokMediaModel> list2, InterfaceC1364105Vn<? super C527510KmT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = list;
        this.LLIZ = context;
        this.LLIZLLLIL = interfaceC383701eN;
        this.LLJ = c527520KmU;
        this.LLJI = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C527510KmT(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<MediaModel> listLIZIZ;
        InterfaceC383701eN interfaceC383701eN;
        C527520KmU c527520KmU;
        List<TikTokMediaModel> list;
        C1C7U.LIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1$imageDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                list = (List) this.LLILZ;
                c527520KmU = this.LLILLL;
                interfaceC383701eN = this.LLILLJJLI;
                listLIZIZ = (List) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILZLL.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1$imageDeferred$1");
                return unit;
            }
            listLIZIZ = C2400609au.LIZIZ(this.LLIZ, false, -1, 0, new C2400709av(null, this.LLILZLL, 0L, 0L, null, null, null, false, false, false, 1021), true, true, false, -1);
            C578570Mmd.LIZ.getClass();
            if (C578570Mmd.LIZ()) {
                HashMap mapLIZ = C0MZO.LIZ();
                C527520KmU c527520KmU2 = this.LLJ;
                for (MediaModel mediaModel : listLIZIZ) {
                    if (c527520KmU2.w2(mapLIZ, mediaModel.LJFF())) {
                        c527520KmU2.LLJILJIL++;
                        mediaModel.subType = 1;
                    }
                }
            }
            interfaceC383701eN = this.LLIZLLLIL;
            c527520KmU = this.LLJ;
            list = this.LLJI;
            this.LL = listLIZIZ;
            this.LLILLJJLI = interfaceC383701eN;
            this.LLILLL = c527520KmU;
            this.LLILZ = list;
            this.LLILZIL = 1;
            if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1$imageDeferred$1");
                return objLJFF;
            }
        }
        try {
            c527520KmU.LLJI += listLIZIZ.size();
            for (MediaModel mediaModel2 : listLIZIZ) {
                C527240Km2 c527240Km2 = TikTokMediaModel.Companion;
                C530020KqW c530020KqWO2 = c527520KmU.o2();
                c527240Km2.getClass();
                list.add(C527240Km2.LIZJ(c530020KqWO2, mediaModel2));
            }
            interfaceC383701eN.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1$imageDeferred$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC383701eN.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
