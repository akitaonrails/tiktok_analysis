package X;

import Y.AObserverS230S0100000_28;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.CommentFiltersViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS438S0200000_2;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS87S0210000_2;

/* JADX INFO: renamed from: X.109F, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C109F extends AbstractC191843103l {
    public final C191848103q LLILLJJLI;
    public final C103P LLILLL;
    public final C01GW LLILZ;

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        boolean z;
        boolean z2;
        boolean zBooleanValue = false;
        CharSequence string = null;
        ICommentSafetyDepService iCommentSafetyDepService = (ICommentSafetyDepService) PluggableExtentionKt.pluggableSpi$default(ICommentSafetyDepService.class, false, false, false, 14, null);
        if (iCommentSafetyDepService != null && iCommentSafetyDepService.LIZJ()) {
            CharSequence charSequenceLIZ = this.LLILLL.LJFF.LIZ(this.LLILLJJLI.LIZ);
            C103N c103n = this.LLILLL.LJI;
            if (c103n != null) {
                string = c103n.LIZ(this.LLILLJJLI.LIZ);
            }
            C191984108w c191984108w = new C191984108w("creator_care_mode_switch", "Switch");
            Integer value = ((CommentFiltersViewModel) this.LLILZ.getValue()).LLILLL.LIZIZ.getValue();
            if (value != null && value.intValue() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (charSequenceLIZ.length() <= 0) {
                charSequenceLIZ = context.getString(2131830104);
            }
            if (string == null || string.length() == 0 || string == null) {
                string = context.getString(2131830103);
            }
            if (C1888240zEk.LIZ() && C1888220zEi.LIZIZ.LIZLLL()) {
                z2 = false;
            } else {
                z2 = true;
            }
            Boolean value2 = ((CommentFiltersViewModel) this.LLILZ.getValue()).LLILLL.LIZJ.getValue();
            if (value2 != null) {
                zBooleanValue = value2.booleanValue();
            }
            C10FD c10fd = new C10FD(null, charSequenceLIZ, string, new AwS438S0200000_2(c191984108w, this, 2), null, null, z, zBooleanValue, z2, false, null, true, new AwS87S0210000_2(c191984108w, this, z, 3), 22065);
            c191984108w.LIZJ = Boolean.valueOf(c10fd.LJIIJ);
            return Collections.singletonList(c10fd);
        }
        return C13BV.INSTANCE;
    }

    public C109F(C191848103q c191848103q, C103P c103p) {
        this.LLILLJJLI = c191848103q;
        this.LLILLL = c103p;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 23));
        this.LLILZ = c01gwLIZIZ;
        ICommentSafetyDepService iCommentSafetyDepService = (ICommentSafetyDepService) PluggableExtentionKt.pluggableSpi$default(ICommentSafetyDepService.class, false, false, false, 14, null);
        if (iCommentSafetyDepService != null && iCommentSafetyDepService.LIZJ()) {
            ((CommentFiltersViewModel) c01gwLIZIZ.getValue()).LLILLL.LIZIZ.observe(c191848103q.LIZJ, new AObserverS230S0100000_28(this, 6));
            ((CommentFiltersViewModel) c01gwLIZIZ.getValue()).LLILLL.LIZJ.observe(c191848103q.LIZJ, new AObserverS230S0100000_28(this, 7));
        }
    }
}
