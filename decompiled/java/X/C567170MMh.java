package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.serviceimpl.MediaDownloadHelper$fetchIMImage$1", f = "MediaDownloadHelper.kt", l = {163}, m = "invokeSuspend")
public final class C567170MMh extends C09AX implements Function2<InterfaceC346701Wf<? super C0MMH>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C567320MMw LLILLL;
    public final /* synthetic */ ForwardMedia LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567170MMh(C567320MMw c567320MMw, ForwardMedia forwardMedia, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C567170MMh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c567320MMw;
        this.LLILZ = forwardMedia;
        this.LLILZIL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567170MMh c567170MMh = new C567170MMh(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c567170MMh.LLILLJJLI = obj;
        return c567170MMh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaDownloadHelper@6562.fetchIMImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            this.LLILLL.getClass();
            C567320MMw.LIZIZ("Starting IM image fetch");
            C567320MMw c567320MMw = this.LLILLL;
            ForwardMedia forwardMedia = this.LLILZ;
            c567320MMw.getClass();
            List<String> sourceCoverList = forwardMedia.video.getSourceCoverList();
            ArrayList arrayList = new ArrayList();
            for (String str : sourceCoverList) {
                String str2 = str;
                C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
                if ((!c912070ZqH.LJ().LJI(str2) && !c912070ZqH.LJ().LJII(str2)) || c912070ZqH.LJ().LJFF(str2)) {
                    arrayList.add(str);
                }
            }
            String str3 = (String) C13LP.LJJJLL(arrayList);
            if (str3 != null && str3.length() != 0) {
                C0MMH c0mmh = new C0MMH(this.LLILLL.LIZJ(str3, this.LLILZIL, this.LLILZ), null, 6);
                this.LL = 1;
                if (interfaceC346701Wf.emit(c0mmh, this) == objLJFF) {
                    C1C7U.LIZIZ("MediaDownloadHelper@6562.fetchIMImage$1");
                    return objLJFF;
                }
            } else {
                throw new IllegalStateException("image path is empty");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaDownloadHelper@6562.fetchIMImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0MMH> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
