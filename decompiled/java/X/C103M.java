package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.CommentFiltersViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.103M, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C103M extends AbstractC191843103l {
    public final CommentFiltersViewModel LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final CharSequence LLILZIL;
    public final CharSequence LLILZLL;

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        boolean z;
        if (C1888220zEi.LIZIZ.LJIIL()) {
            C191984108w c191984108w = new C191984108w("review_filtered_comments_entrance", "Disclosure");
            CharSequence string = this.LLILZIL;
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                string = context.getString(2131829178);
            }
            CharSequence string2 = this.LLILZLL;
            if (string2 == null || string2.length() == 0 || string2 == null) {
                string2 = context.getString(2131829177);
            }
            return Collections.singletonList(new C10FB(null, string, string2, null, new AwS237S0300000_28(c191984108w, this, context, 1), null, false, false, false, false, true, new AwS429S0200000_28(c191984108w, this, 1), 10217));
        }
        return C13BV.INSTANCE;
    }

    public C103M(C191848103q c191848103q, C103P c103p) {
        CharSequence charSequenceLIZ;
        String string;
        this.LLILLJJLI = (CommentFiltersViewModel) new ViewModelProvider(c191848103q.LIZIZ).get(CommentFiltersViewModel.class);
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
    }
}
