package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Mqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581230Mqv implements InterfaceC1478005qU {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C581230Mqv c581230Mqv, C09AJ c09aj) {
        int iQueryDraftCount;
        C116F c116f = (C116F) c581230Mqv.l1;
        String str = c581230Mqv.s0;
        c116f.getClass();
        C1C7U.LIZ("StickerPropAwemeModel@a55.fetchList2$2L");
        c116f.LLILZLL = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!arrayList.isEmpty()) {
            iQueryDraftCount = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().queryDraftCount(new C0M4M(EnumC562220M3g.NORMAL, new C562260M3k(EnumC562230M3h.EFFECT, arrayList, EnumC562250M3j.LIKE)));
        } else {
            iQueryDraftCount = 0;
        }
        if (!c09aj.isDisposed()) {
            c09aj.onNext(Integer.valueOf(iQueryDraftCount));
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("StickerPropAwemeModel@a55.fetchList2$2L");
    }

    public static final void subscribe$1(C581230Mqv c581230Mqv, C09AJ c09aj) {
        C1C7U.LIZ("CutVideoSingleBottomScene@27ee.tryShowDragBubble$1");
        String str = c581230Mqv.s0;
        CutMultiVideoViewModel cutMultiVideoViewModel = ((C1173010gd9) c581230Mqv.l1).LLJJJJ;
        if (cutMultiVideoViewModel == null) {
            cutMultiVideoViewModel = null;
        }
        MediaModel mediaModelLIZ = C12VL.LIZ(str, cutMultiVideoViewModel);
        if (mediaModelLIZ != null) {
            c09aj.onNext(mediaModelLIZ);
        }
        c09aj.onComplete();
        C1C7U.LIZIZ("CutVideoSingleBottomScene@27ee.tryShowDragBubble$1");
    }

    public C581230Mqv(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
