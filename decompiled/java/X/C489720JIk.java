package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.zhiliaoapp.musically.R;
import irm.AkS79S0100000_7;

/* JADX INFO: renamed from: X.0JIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489720JIk extends C0JN0 {
    public C16F5 LLILLL;
    public View LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public boolean LLIZ;

    public final void LJ() {
        C489660JIe c489660JIe;
        this.LLIZ = true;
        final String str = null;
        C23250099c.LIZLLL(getCoroutineScope(), null, null, new C489730JIl(this, null), 3);
        String strLJIJI = C497740JfY.LJIJI(2131834551);
        AbstractC489650JId abstractC489650JId = getPlayerChannel().LIZIZ.LIZIZ.LIZIZ;
        if (abstractC489650JId != null && (abstractC489650JId instanceof C489660JIe) && (c489660JIe = (C489660JIe) abstractC489650JId) != null) {
            str = c489660JIe.LIZIZ;
        }
        final C16F5 title = getTitle();
        final C16F5 titleExpandToggle = getTitleExpandToggle();
        if (title != null) {
            title.setText(str);
        }
        if (titleExpandToggle != null) {
            titleExpandToggle.setText(strLJIJI);
        }
        if (title != null) {
            C786410Ut5.x3(title.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0DeQ
                public final /* synthetic */ int LLILLJJLI = 2;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C786410Ut5.C3(title.getViewTreeObserver(), this);
                    if (title.getLineCount() <= this.LLILLJJLI) {
                        C16F5 c16f5 = titleExpandToggle;
                        if (c16f5 != null) {
                            C500260Jjc.LJIILIIL(c16f5);
                            return;
                        }
                        return;
                    }
                    title.setText(str);
                    title.setMaxLines(this.LLILLJJLI);
                    title.setEllipsize(TextUtils.TruncateAt.END);
                    C16F5 c16f52 = titleExpandToggle;
                    if (c16f52 != null) {
                        C500260Jjc.LLFFF(c16f52);
                    }
                }
            });
        }
    }

    private final C16F5 getCreatorName() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f8f);
            this.LLILLL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    private final C16F5 getTitle() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_title);
            this.LLILZIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    private final View getTitleContainer() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.video_title_container);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    private final C16F5 getTitleExpandToggle() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y1h);
            this.LLILZLL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    @Override // X.C0JN0
    public final void LIZIZ() {
        C489660JIe c489660JIe;
        C16F5 creatorName = getCreatorName();
        if (creatorName != null) {
            creatorName.setTextDirection(C454590Hs9.LIZ(getContext()) ? 4 : 3);
        }
        View titleContainer = getTitleContainer();
        if (titleContainer != null) {
            titleContainer.setLayoutDirection(0);
        }
        C16F5 title = getTitle();
        if (title != null) {
            title.setTextDirection(C454590Hs9.LIZ(getContext()) ? 4 : 3);
        }
        C16F5 creatorName2 = getCreatorName();
        if (creatorName2 != null) {
            AbstractC489650JId abstractC489650JId = getPlayerChannel().LIZIZ.LIZIZ.LIZIZ;
            String str = null;
            if (abstractC489650JId != null && (abstractC489650JId instanceof C489660JIe) && (c489660JIe = (C489660JIe) abstractC489650JId) != null) {
                str = c489660JIe.LIZ;
            }
            creatorName2.setText(str);
        }
        View titleContainer2 = getTitleContainer();
        if (titleContainer2 != null) {
            C786410Ut5.I7(new AkS79S0100000_7(this, 11), titleContainer2);
        }
        LJ();
    }

    public final void LIZLLL() {
        C489660JIe c489660JIe;
        getPlayerChannel().LJIIIZ.setValue(Boolean.valueOf(!this.LLIZ));
        if (!this.LLIZ) {
            LJ();
            return;
        }
        C16F5 titleExpandToggle = getTitleExpandToggle();
        if (titleExpandToggle == null || titleExpandToggle.getVisibility() != 8) {
            this.LLIZ = false;
            C23250099c.LIZLLL(getCoroutineScope(), null, null, new C489730JIl(this, null), 3);
            String strLJIJI = C497740JfY.LJIJI(2131834550);
            AbstractC489650JId abstractC489650JId = getPlayerChannel().LIZIZ.LIZIZ.LIZIZ;
            String str = (abstractC489650JId == null || !(abstractC489650JId instanceof C489660JIe) || (c489660JIe = (C489660JIe) abstractC489650JId) == null) ? null : c489660JIe.LIZIZ;
            C16F5 title = getTitle();
            C16F5 titleExpandToggle2 = getTitleExpandToggle();
            if (titleExpandToggle2 != null) {
                titleExpandToggle2.setText(strLJIJI);
            }
            if (title != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('\n');
                title.setText(C2188811AlT.LIZIZ(sbLIZ));
                title.setMaxLines(Integer.MAX_VALUE);
                title.setEllipsize(null);
            }
        }
    }

    public C489720JIk(Context context) {
        super(context, null);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dfj, this, true);
        this.LLIZ = true;
    }
}
