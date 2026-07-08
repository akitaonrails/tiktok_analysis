package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0hho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214340hho extends AbstractC1906720ziY {
    public final List<Integer> LLIZLLLIL;
    public final Map<Integer, String> LLJ;
    public AnonymousClass0389 LLJI;

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0389] */
    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        String str;
        final Context context = getContext();
        if (context != null && (!this.LLIZLLLIL.isEmpty())) {
            this.LLJI = new LinearLayout(context) { // from class: X.0389
                public TuxTextView LL;

                public final TuxTextView getChunkHeaderFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.dt7);
                        this.LL = (TuxTextView) callbackFindViewById;
                    }
                    return (TuxTextView) callbackFindViewById;
                }

                {
                    C786410Ut5.Sd(R.layout.ec7, C786410Ut5.ne(getContext()), this);
                }

                public final void setChunkHeaderFromXml(TuxTextView tuxTextView) {
                    this.LL = tuxTextView;
                }

                public final void setChunkText(String str2) {
                    getChunkHeaderFromXml().setText(str2);
                }
            };
            if (C1EDI.LJ()) {
                AnonymousClass0389 anonymousClass0389 = this.LLJI;
                if (anonymousClass0389 == null) {
                    anonymousClass0389 = null;
                }
                int visibility = anonymousClass0389.getVisibility();
                anonymousClass0389.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, anonymousClass0389);
            } else {
                AnonymousClass0389 anonymousClass03892 = this.LLJI;
                if (anonymousClass03892 == null) {
                    anonymousClass03892 = null;
                }
                String strLIZJ = C1216270hkv.LIZJ(2131835584);
                if (strLIZJ == null) {
                    strLIZJ = "";
                }
                anonymousClass03892.setChunkText(strLIZJ);
            }
            AnonymousClass0389 anonymousClass03893 = this.LLJI;
            LJII(anonymousClass03893 != null ? anonymousClass03893 : null);
        }
        Iterator<Integer> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            C20600815jK<InterfaceC1891350zJl> c20600815jK = this.LLILZLL;
            Map<Integer, String> map = this.LLJ;
            if (map == null || (str = map.get(Integer.valueOf(iIntValue))) == null) {
                str = "";
            }
            C20600815jK.LIZJ(c20600815jK, new C1214280hhi(iIntValue, str));
        }
    }

    public C1214340hho(List<Integer> list, Map<Integer, String> map) {
        this.LLIZLLLIL = list;
        this.LLJ = map;
    }
}
