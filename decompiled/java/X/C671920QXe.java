package X;

import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.view.KeyEvent;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671920QXe extends C0QXZ {
    public TuxTextView LLJI;

    @Override // X.C0QY2
    public final void rj() {
    }

    public final TuxTextView getTvSearchInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_search_input);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.C0QXZ, X.C0QY2
    public final void Aj() {
        Word word;
        C0QW4 value = getCurrentSearchHintWord().getValue();
        if (Intrinsics.LJFF((value == null || (word = value.LIZ) == null) ? null : word.getWord(), getDefaultHintWord())) {
            return;
        }
        C1018703yb.LIZIZ("trending_words_show", LIZ().LIZ);
    }

    @Override // X.C0QXZ
    public final C2344009Gk LIZ() {
        Word word;
        Word word2;
        Word word3;
        C2344009Gk c2344009GkLIZ = super.LIZ();
        c2344009GkLIZ.LJIIIIZZ("words_source", getEntranceModel().LJIIZILJ);
        C0QW4 value = getCurrentSearchHintWord().getValue();
        String implId = null;
        c2344009GkLIZ.LJ(value != null ? Integer.valueOf(value.LIZIZ) : null, "words_position");
        C0QW4 value2 = getCurrentSearchHintWord().getValue();
        c2344009GkLIZ.LJIIIIZZ("words_content", (value2 == null || (word3 = value2.LIZ) == null) ? null : word3.getWord());
        C0QW4 value3 = getCurrentSearchHintWord().getValue();
        c2344009GkLIZ.LJIIIIZZ("group_id", (value3 == null || (word2 = value3.LIZ) == null) ? null : C1208204o4.LIZ(word2));
        C0QW4 value4 = getCurrentSearchHintWord().getValue();
        if (value4 != null && (word = value4.LIZ) != null) {
            implId = word.getImplId();
        }
        c2344009GkLIZ.LJIIIIZZ("impr_id", implId);
        c2344009GkLIZ.LJIIIIZZ("search_position", getEntranceModel().LIZ);
        c2344009GkLIZ.LIZJ(1, "is_ecom_search");
        c2344009GkLIZ.LJIIIIZZ("search_entrance", getEntranceModel().LJIILIIL);
        return c2344009GkLIZ;
    }

    @Override // X.C0QXZ, X.C0QY2
    public EnumC671980QXk getEntranceViewType() {
        return EnumC671980QXk.WORD;
    }

    @Override // X.C0QXZ
    public final SmartRoute LIZIZ(Context context) {
        String word;
        SmartRoute smartRouteLIZIZ;
        Word word2;
        Word word3;
        C0QW4 value = getCurrentSearchHintWord().getValue();
        String implId = null;
        if (value != null && (word3 = value.LIZ) != null) {
            word = word3.getWord();
        } else {
            word = null;
        }
        if (!C123100dR.LIZ(word) || (smartRouteLIZIZ = super.LIZIZ(context)) == null) {
            return null;
        }
        smartRouteLIZIZ.withParam("enter_method", getEntranceModel().LJIILLIIL);
        smartRouteLIZIZ.withParam("keyword", word);
        smartRouteLIZIZ.withParam("search_hint_word", word);
        smartRouteLIZIZ.withParam("back_flag", 1);
        C0QW4 value2 = getCurrentSearchHintWord().getValue();
        if (value2 != null && (word2 = value2.LIZ) != null) {
            implId = word2.getImplId();
        }
        smartRouteLIZIZ.withParam("trending_words_id", implId);
        return smartRouteLIZIZ;
    }

    public final void setTvSearchInputFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public C671920QXe(Context context, C671890QXb c671890QXb, Function0 function0) {
        super(context, c671890QXb, function0);
        C786410Ut5.Sd(R.layout.ewh, C786410Ut5.ne(getContext()), this);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ != null) {
            getCurrentSearchHintWord().observe(c19egLIZIZ, new AObserverS214S0100000_10(this, 140));
        }
        TuxTextView tvSearchInputFromXml = getTvSearchInputFromXml();
        if (tvSearchInputFromXml != null) {
            C786410Ut5.h9(tvSearchInputFromXml, new ACListenerS145S0100000_10(this, 89));
        }
        setDefaultHintWordInView(null);
    }
}
