package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.SideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraSideMessageStatusReusedSkeletonUISlot;
import java.util.List;

/* JADX INFO: renamed from: X.0ZOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899050ZOt extends AbstractC899510ZQn<SideMessageStatusReusedSkeletonUISlot, MessageLeftIconState> {
    public final AbstractC899510ZQn<?, MessageLeftIconState> LIZJ;

    public C899050ZOt(AbstractC899510ZQn<?, MessageLeftIconState> abstractC899510ZQn) {
        super(new C899520ZQo(C13LE.LIZ(DMCameraSideMessageStatusReusedSkeletonUISlot.class)));
        this.LIZJ = abstractC899510ZQn;
    }

    @Override // X.AbstractC899510ZQn
    public final void LIZIZ(List<? extends C869590Y9l> list) {
        this.LIZJ.LIZIZ(list);
    }

    @Override // X.AbstractC899510ZQn
    public final C461020I6a<MessageLeftIconState> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
        return this.LIZJ.LIZ(list, c869590Y9l, i);
    }
}
