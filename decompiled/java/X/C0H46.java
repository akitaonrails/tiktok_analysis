package X;

import Y.ACListenerS77S0300000_10;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS407S0200000_6;

/* JADX INFO: renamed from: X.0H46, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H46 extends FrameLayout {
    public final C01GW LL;
    public final List<RelatedWord> LLILLJJLI;
    public C0HBA LLILLL;

    private final View getLayout() {
        return (View) this.LL.getValue();
    }

    public final void LIZ(C0H47 c0h47) {
        int i;
        List<RelatedWord> list = c0h47.relatedWords;
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
        this.LLILLL = c0h47.rsMobModel;
        View layout = getLayout();
        int i2 = 0;
        if (list.isEmpty()) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, layout);
        final ViewGroup viewGroup = (ViewGroup) getLayout().findViewById(R.id.ttg);
        if (viewGroup == null) {
            return;
        }
        int size = list.size() - viewGroup.getChildCount();
        while (size != 0) {
            if (size > 0) {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f0v, viewGroup, false);
                C427690Gpr.LJ(viewTd, 0.0f);
                C786410Ut5.I7(new ACListenerS77S0300000_10((Object) viewGroup, viewTd, (Map<String, String>) this, (View) 16), viewTd);
                viewTd.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0PV8
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        String str;
                        String wordSource;
                        Map<String, String> map;
                        int iIndexOfChild = viewGroup.indexOfChild(viewTd);
                        C0H46 c0h46 = this;
                        RelatedWord relatedWord = (RelatedWord) ListProtector.get(c0h46.LLILLJJLI, iIndexOfChild);
                        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
                        C653660PkS c653660PkS = new C653660PkS();
                        c653660PkS.LJFF = ((C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ()).LLIZLLLIL;
                        C0HBA c0hba = c0h46.LLILLL;
                        if (c0hba != null) {
                            str = c0hba.imprId;
                        } else {
                            str = null;
                        }
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        c653660PkS.LJIIJJI = str;
                        if (c0hba != null && (map = c0hba.extraParams) != null) {
                            c653660PkS.LIZ().putAll(map);
                        }
                        Context context = view.getContext();
                        Word word = relatedWord.wordRecord;
                        if (word != null && (wordSource = word.getWordSource()) != null) {
                            str2 = wordSource;
                        }
                        C670730QSp.LIZIZ(view, context, c653660PkS, word, str2, null, C0QN9.RS, null, null, null);
                        return true;
                    }
                });
                C2211631BhB.LJ(viewTd, new AwS215S0300000_6(viewGroup, viewTd, this, 36));
                viewGroup.addView(viewTd);
                size--;
            } else {
                C786410Ut5.LJJLIL(viewGroup.getChildCount() - 1, viewGroup);
                size++;
            }
        }
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                Object next = c09re.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    TextView textView = (TextView) ((View) next).findViewById(R.id.t46);
                    if (textView != null) {
                        textView.setText(((RelatedWord) ListProtector.get(list, i2)).text);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    public C0H46(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 113));
        this.LLILLJJLI = new ArrayList();
    }
}
