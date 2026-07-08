package X;

import Y.AObserverS230S0100000_28;
import android.content.Context;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.CommentFiltersViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS438S0200000_2;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS87S0210000_2;

/* JADX INFO: renamed from: X.109I, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C109I extends AbstractC191843103l {
    public final C191848103q LLILLJJLI;
    public final C103P LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public final PrivacySettingsRestrictionItem LJIILIIL() {
        return (PrivacySettingsRestrictionItem) this.LLILZIL.getValue();
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        boolean z;
        boolean z2;
        if (C191985108x.LIZLLL(LJIILIIL()).LIZIZ) {
            CharSequence charSequenceLIZ = this.LLILLL.LJFF.LIZ(this.LLILLJJLI.LIZ);
            C103N c103n = this.LLILLL.LJI;
            CharSequence string = null;
            if (c103n != null) {
                string = c103n.LIZ(this.LLILLJJLI.LIZ);
            }
            C191984108w c191984108w = new C191984108w("filter_spam_offensive_comments_item", "Switch");
            Integer value = ((CommentFiltersViewModel) this.LLILZ.getValue()).LL.LIZIZ.getValue();
            boolean zBooleanValue = false;
            if (value != null && value.intValue() == 2) {
                z = false;
            } else {
                z = true;
            }
            if (charSequenceLIZ.length() <= 0) {
                charSequenceLIZ = context.getString(2131829048);
            }
            if (string == null || string.length() == 0 || string == null) {
                string = context.getString(2131829162);
            }
            if (C191985108x.LIZLLL(LJIILIIL()).LIZ && (!C1888240zEk.LIZ() || !C1888220zEi.LIZIZ.LIZLLL())) {
                z2 = true;
            } else {
                z2 = false;
            }
            Boolean value2 = ((CommentFiltersViewModel) this.LLILZ.getValue()).LL.LIZJ.getValue();
            if (value2 != null) {
                zBooleanValue = value2.booleanValue();
            }
            C10FD c10fd = new C10FD(null, charSequenceLIZ, string, new AwS438S0200000_2(c191984108w, this, 1), new AwS394S0200000_28(c191984108w, this, 7), null, z, zBooleanValue, z2, false, null, false, new AwS87S0210000_2(c191984108w, this, z, 2), 24097);
            c191984108w.LIZJ = Boolean.valueOf(c10fd.LJIIJ);
            return Collections.singletonList(c10fd);
        }
        return C13BV.INSTANCE;
    }

    public C109I(C191848103q c191848103q, C103P c103p) {
        this.LLILLJJLI = c191848103q;
        this.LLILLL = c103p;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 22));
        this.LLILZ = c01gwLIZIZ;
        this.LLILZIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(41));
        ((CommentFiltersViewModel) c01gwLIZIZ.getValue()).LL.LIZIZ.observe(c191848103q.LIZJ, new AObserverS230S0100000_28(this, 4));
        ((CommentFiltersViewModel) c01gwLIZIZ.getValue()).LL.LIZJ.observe(c191848103q.LIZJ, new AObserverS230S0100000_28(this, 5));
    }
}
