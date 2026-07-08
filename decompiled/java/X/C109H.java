package X;

import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.CommentFiltersViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS105S0210000_28;
import kotlin.jvm.internal.AwS463S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: renamed from: X.109H, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C109H extends AbstractC191843103l {
    public final C01GW LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final CharSequence LLILZIL;
    public final CharSequence LLILZLL;

    public final CommentFiltersViewModel LJIILIIL() {
        return (CommentFiltersViewModel) this.LLILLJJLI.getValue();
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        boolean z;
        ICommentSafetyDepService iCommentSafetyDepService;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zBooleanValue = false;
        ICommentSafetyDepService iCommentSafetyDepService2 = (ICommentSafetyDepService) PluggableExtentionKt.pluggableSpi$default(ICommentSafetyDepService.class, false, false, false, 14, null);
        if (iCommentSafetyDepService2 != null && iCommentSafetyDepService2.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String string = context.getString(2131829159);
            String string2 = context.getString(2131829046);
            Integer value = LJIILIIL().LLILLJJLI.LIZIZ.getValue();
            if (value != null && value.intValue() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            Boolean value2 = LJIILIIL().LLILLJJLI.LIZJ.getValue();
            if (value2 != null) {
                zBooleanValue = value2.booleanValue();
            }
            return Collections.singletonList(new C10FD(null, string, string2, new AwS642S0100000_28(this, 2), null, null, z4, zBooleanValue, false, false, null, false, null, 32561));
        }
        if (!C1888220zEi.LIZIZ.LJIIL() || ((iCommentSafetyDepService = (ICommentSafetyDepService) PluggableExtentionKt.pluggableSpi$default(ICommentSafetyDepService.class, false, false, false, 14, null)) != null && iCommentSafetyDepService.LIZJ())) {
            return C13BV.INSTANCE;
        }
        C191984108w c191984108w = new C191984108w("filter_all_comments_item", "Switch");
        c191984108w.LIZJ = Boolean.TRUE;
        Integer value3 = LJIILIIL().LLILLJJLI.LIZIZ.getValue();
        if (value3 != null && value3.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        CharSequence string3 = this.LLILZIL;
        if (string3.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            string3 = context.getString(2131829159);
        }
        CharSequence string4 = this.LLILZLL;
        if (string4 == null || string4.length() == 0 || string4 == null) {
            string4 = context.getString(2131829046);
        }
        Boolean value4 = LJIILIIL().LLILLJJLI.LIZJ.getValue();
        if (value4 != null) {
            zBooleanValue = value4.booleanValue();
        }
        return Collections.singletonList(new C10FD(null, string3, string4, new AwS463S0200000_28(c191984108w, this, 1), null, null, z2, zBooleanValue, false, false, null, false, new AwS105S0210000_28(c191984108w, this, z2, 0), 24369));
    }

    public C109H(C191848103q c191848103q, C103P c103p) {
        CharSequence charSequenceLIZ;
        String string;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(c191848103q, 24));
        this.LLILLL = c191848103q.LIZLLL;
        Bundle bundle = c191848103q.LJ;
        this.LLILZ = (bundle == null || (string = bundle.getString("enter_method")) == null) ? "" : string;
        this.LLILZIL = c103p.LJFF.LIZ(c191848103q.LIZ);
        C103N c103n = c103p.LJI;
        if (c103n != null) {
            charSequenceLIZ = c103n.LIZ(c191848103q.LIZ);
        } else {
            charSequenceLIZ = null;
        }
        this.LLILZLL = charSequenceLIZ;
        LJIILIIL().LLILLJJLI.LIZIZ.observe(c191848103q.LIZJ, new AObserverS230S0100000_28(this, 8));
        LJIILIIL().LLILLJJLI.LIZJ.observe(c191848103q.LIZJ, new AObserverS230S0100000_28(this, 9));
    }
}
