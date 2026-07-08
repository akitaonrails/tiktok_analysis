package X;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC748830TYz extends FrameLayout implements InterfaceC748810TYx {
    public LiveEditText LL;
    public C418350Gan LLILLJJLI;
    public C0TZ9 LLILLL;
    public final C748800TYw LLILZ;
    public InputFilter.LengthFilter LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public Function0<Unit> LLJI;

    @Override // X.InterfaceC748810TYx
    public final void LIZJ() {
    }

    @Override // X.InterfaceC748810TYx
    public final void LJ() {
    }

    public abstract View LJI();

    public abstract void LJIIIZ();

    public abstract void LJIIJJI();

    public abstract int getLayoutId$livebroadcast_api_release();

    public int getMaxLinesInFoldedStatus$livebroadcast_api_release() {
        return 1;
    }

    public final LiveEditText getBlockWordEditTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c45);
            this.LL = (LiveEditText) callbackFindViewById;
        }
        return (LiveEditText) callbackFindViewById;
    }

    public final C418350Gan getBlockWordEditTextHintFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c46);
            this.LLILLJJLI = (C418350Gan) callbackFindViewById;
        }
        return (C418350Gan) callbackFindViewById;
    }

    public final C0TZ9 getFlowLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.idc);
            this.LLILLL = (C0TZ9) callbackFindViewById;
        }
        return (C0TZ9) callbackFindViewById;
    }

    public final void LJIIJ() {
        getBlockWordEditTextHintFromXml().setText(getContext().getString(2131842768, Integer.valueOf(this.LLIZ)));
    }

    public final boolean getHasSheet$livebroadcast_api_release() {
        return this.LLIZLLLIL;
    }

    public final int getMaxSingleWordLength$livebroadcast_api_release() {
        return this.LLIZ;
    }

    public final long getMaxWordsCount$livebroadcast_api_release() {
        return this.LLILZLL;
    }

    public final Function0<Unit> getOnAddSuccessCallback() {
        return this.LLJI;
    }

    @Override // X.InterfaceC748810TYx
    public final void LIZ(BlockWord blockWord) {
        String str;
        getFlowLayoutFromXml().LIZ(blockWord, LJI(), 0);
        LJIIJJI();
        Function0<Unit> function0 = this.LLJI;
        if (function0 != null) {
            function0.invoke();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stopword_set_success");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(blockWord.content, "context");
        if (this.LLJ) {
            str = "host";
        } else {
            str = "moderator";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC748810TYx
    public final void LIZIZ(BlockWord blockWord) {
        C0TZ9 flowLayoutFromXml = getFlowLayoutFromXml();
        flowLayoutFromXml.LLIZLLLIL = true;
        int childCount = flowLayoutFromXml.getChildCount() - 2;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                if (Intrinsics.LJFF(((AppCompatTextView) flowLayoutFromXml.getChildAt(i).findViewById(R.id.c41)).getText(), blockWord.content)) {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(flowLayoutFromXml, null);
                    flowLayoutFromXml.removeViewAt(i);
                    break;
                } else if (i == childCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        LJIIJJI();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stopword_cancel");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(blockWord.content, "context");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC748810TYx
    public final void LJFF(Throwable th) {
        String str;
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            switch (c501470JlZ.getErrorCode()) {
                case 80070:
                    str = "limited";
                    break;
                case 80071:
                    str = "illegal";
                    break;
                case 80072:
                    str = "lengthy";
                    break;
                case 80073:
                    str = "existed";
                    break;
                default:
                    C766270U4b.LIZLLL(2131854909);
                    return;
            }
            C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stopword_set_toast");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str, "toast_type");
            c474500IjALIZ.LIZ();
        }
    }

    public final void setAnchor(boolean z) {
        this.LLJ = z;
    }

    public final void setBlockWordEditTextFromXml(LiveEditText liveEditText) {
        this.LL = liveEditText;
    }

    public final void setBlockWordEditTextHintFromXml(C418350Gan c418350Gan) {
        this.LLILLJJLI = c418350Gan;
    }

    public final void setFlowLayoutFromXml(C0TZ9 c0tz9) {
        this.LLILLL = c0tz9;
    }

    public final void setHasSheet$livebroadcast_api_release(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setMaxSingleWordLength$livebroadcast_api_release(int i) {
        this.LLIZ = i;
    }

    public final void setMaxWordsCount$livebroadcast_api_release(long j) {
        this.LLILZLL = j;
    }

    public final void setOnAddSuccessCallback(Function0<Unit> function0) {
        this.LLJI = function0;
    }

    public AbstractC748830TYz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = new C748800TYw(this);
        this.LLIZ = 30;
        C786120Usc c786120Usc = new C786120Usc(this, 4);
        C785880UsE c785880UsE = new C785880UsE(context, this, 0);
        FrameLayout.inflate(getContext(), getLayoutId$livebroadcast_api_release(), this);
        getBlockWordEditTextFromXml().addTextChangedListener(c786120Usc);
        getBlockWordEditTextFromXml().setOnEditorActionListener(c785880UsE);
        LJIIIZ();
        getFlowLayoutFromXml().setDeleteListener(new AwS591S0100000_12(this, 1010));
        getFlowLayoutFromXml().setMaxLinesInFoldStatus(getMaxLinesInFoldedStatus$livebroadcast_api_release());
        LJIIJJI();
        LJIIJ();
    }

    @Override // X.InterfaceC748810TYx
    public final void LIZLLL(List<BlockWord> list, long j, long j2) {
        this.LLILZLL = j;
        this.LLIZ = (int) j2;
        for (BlockWord blockWord : list) {
            getFlowLayoutFromXml().LIZ(blockWord, LJI(), r2.getChildCount() - 1);
        }
        LJIIJJI();
        LJIIJ();
    }

    public final void LJII(String str, long j, String str2, boolean z, boolean z2) {
        C748800TYw c748800TYw = this.LLILZ;
        c748800TYw.LIZLLL = z;
        c748800TYw.LJ = str;
        c748800TYw.LJFF = j;
        c748800TYw.LJI = false;
        c748800TYw.LIZJ = str2;
        c748800TYw.LIZJ();
        this.LLIZLLLIL = z2;
        this.LLJ = z;
    }
}
