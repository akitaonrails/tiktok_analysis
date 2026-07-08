package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$triggerGeneration$1", f = "MvChoosePhotoScene.kt", l = {}, m = "invokeSuspend")
public final class C526250KkR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC526620Kl2 LL;
    public final /* synthetic */ List<MediaModel> LLILLJJLI;
    public final /* synthetic */ MvChoosePhotoScene LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C526250KkR(InterfaceC526620Kl2 interfaceC526620Kl2, List<? extends MediaModel> list, MvChoosePhotoScene mvChoosePhotoScene, InterfaceC1364105Vn<? super C526250KkR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC526620Kl2;
        this.LLILLJJLI = list;
        this.LLILLL = mvChoosePhotoScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526250KkR(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RecordEffectModel recordEffectModel;
        CreativeModel creativeModel;
        C1C7U.LIZ("MvChoosePhotoScene@c985.triggerGeneration$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC526620Kl2 interfaceC526620Kl2 = this.LL;
        List<MediaModel> list = this.LLILLJJLI;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        Iterator<MediaModel> it2 = list.iterator();
        while (true) {
            recordEffectModel = null;
            if (!it2.hasNext()) {
                break;
            }
            MediaModel next = it2.next();
            if (next.LJIIJ()) {
                String strLJFF = next.LJFF();
                long j = next.duration;
                String str = next.id;
                String str2 = next.userName;
                if (str2 == null) {
                    str2 = "GIPHY";
                }
                c13dvLIZIZ.add(new C1621190sI1(0, strLJFF, str, str2, j, "media_gallery", 4));
            }
        }
        List<C1621190sI1> listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        ShortVideoContext shortVideoContext = this.LLILLL.shortVideoContext;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            recordEffectModel = creativeModel.recordEffectModel;
        }
        interfaceC526620Kl2.o71(listLIZ, recordEffectModel);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.triggerGeneration$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
