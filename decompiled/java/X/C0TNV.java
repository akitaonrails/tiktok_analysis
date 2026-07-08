package X;

import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerFragment;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0TNV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TNV extends C09AY implements InterfaceC1631620sYq<C03H5, List<? extends String>, List<? extends String>, Unit> {
    public final /* synthetic */ MixFeedManagerFragment LL;
    public final /* synthetic */ C118300cf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TNV(MixFeedManagerFragment mixFeedManagerFragment, C118300cf c118300cf) {
        super(3);
        this.LL = mixFeedManagerFragment;
        this.LLILLJJLI = c118300cf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C03H5 c03h5, List<? extends String> list, List<? extends String> list2) {
        boolean z;
        List<? extends String> list3 = list;
        if (list3 != null) {
            MixFeedManagerFragment mixFeedManagerFragment = this.LL;
            C118300cf c118300cf = this.LLILLJJLI;
            C0TNT c0tnt = mixFeedManagerFragment.LLILLJJLI;
            if (c0tnt == null) {
                c0tnt = null;
            }
            C197039127h addVideoView = c0tnt.getAddVideoView();
            if (addVideoView != null) {
                if (list3.size() < c118300cf.element) {
                    z = true;
                } else {
                    z = false;
                }
                addVideoView.setEnabled(z);
            }
        }
        return Unit.LIZ;
    }
}
