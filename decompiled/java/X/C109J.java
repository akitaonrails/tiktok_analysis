package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.109J, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C109J extends AbstractC191843103l {
    public final String LLILLJJLI;
    public final CharSequence LLILLL;
    public final CharSequence LLILZ;

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        boolean z;
        boolean z2;
        C191984108w c191984108w = new C191984108w("filter_keywords_in_comments_entrance", "Disclosure");
        CharSequence string = this.LLILLL;
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            string = context.getString(2131829047);
        }
        CharSequence string2 = this.LLILZ;
        if (string2 == null || string2.length() == 0 || string2 == null) {
            string2 = context.getString(2131829160);
        }
        if (C1888240zEk.LIZ() && C1888220zEi.LIZIZ.LIZLLL()) {
            z2 = false;
        } else {
            z2 = true;
        }
        return Collections.singletonList(new C10FB(null, string, string2, null, new AwS394S0200000_28(c191984108w, this, 8), null, z2, false, false, false, false, new AwS429S0200000_28(c191984108w, this, 0), 12201));
    }

    public C109J(C191848103q c191848103q, C103P c103p) {
        CharSequence charSequenceLIZ;
        this.LLILLJJLI = c191848103q.LIZLLL;
        this.LLILLL = c103p.LJFF.LIZ(c191848103q.LIZ);
        C103N c103n = c103p.LJI;
        if (c103n != null) {
            charSequenceLIZ = c103n.LIZ(c191848103q.LIZ);
        } else {
            charSequenceLIZ = null;
        }
        this.LLILZ = charSequenceLIZ;
    }
}
