package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0kyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340290kyx extends TuxTextView implements InterfaceC1339670kxx {
    public final String LLJJJJ;
    public final int LLJJJJJIL;
    public InterfaceC1340280kyw LLJJJJLIIL;
    public AbstractC1340120kyg LLJJL;
    public Comment LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final String LLJLIL;
    public final String LLJLILLLLZIIL;
    public final String LLJLL;

    @Override // X.InterfaceC1339670kxx
    public final void LJII() {
    }

    public final void LJJJJJ(String str) {
        SpannableString spannableString = new SpannableString(str);
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), 0, spannableString.length(), 33);
        setText(spannableString);
        setTextColor(this.LLJJJJJIL);
    }

    public final void setComment(Comment comment) {
        String cid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setComment cid:");
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        sbLIZ.append(cid);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJLIIIJLLLLLLLZ = comment;
    }

    @Override // X.InterfaceC1339670kxx
    public void setTranslateClickListener(InterfaceC1340280kyw interfaceC1340280kyw) {
        this.LLJJJJLIIL = interfaceC1340280kyw;
    }

    @Override // X.InterfaceC1339670kxx
    public void setTranslationState(AbstractC1340120kyg abstractC1340120kyg) {
        String cid;
        String cid2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTranslationState old:");
        sbLIZ.append(this.LLJJL);
        sbLIZ.append(" new:");
        sbLIZ.append(abstractC1340120kyg);
        sbLIZ.append(", cid:");
        Comment comment = this.LLJJLIIIJLLLLLLLZ;
        Boolean boolValueOf = null;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        sbLIZ.append(cid);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJL = abstractC1340120kyg;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateButtonUI state:");
        sbLIZ2.append(this.LLJJL);
        sbLIZ2.append(", cid:");
        Comment comment2 = this.LLJJLIIIJLLLLLLLZ;
        if (comment2 != null) {
            cid2 = comment2.getCid();
        } else {
            cid2 = null;
        }
        sbLIZ2.append(cid2);
        sbLIZ2.append(", isAudioTextTranslated:");
        Comment comment3 = this.LLJJLIIIJLLLLLLLZ;
        if (comment3 != null) {
            boolValueOf = Boolean.valueOf(comment3.isAudioTextIsTranslated());
        }
        sbLIZ2.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ2);
        AbstractC1340120kyg abstractC1340120kyg2 = this.LLJJL;
        if (abstractC1340120kyg2 instanceof C1340020kyW) {
            if (!((C1340020kyW) abstractC1340120kyg2).LIZIZ) {
                C786410Ut5.u(this, 8);
                return;
            }
            LJJJJJ(this.LLJLIL);
            this.LLJL = true;
            setClickable(true);
            C786410Ut5.u(this, 0);
            return;
        }
        if (Intrinsics.LJFF(abstractC1340120kyg2, C1340030kyX.LIZIZ)) {
            LJJJJJ(this.LLJLILLLLZIIL);
            setClickable(false);
            C786410Ut5.u(this, 0);
        } else {
            if (Intrinsics.LJFF(abstractC1340120kyg2, C1340130kyh.LIZIZ)) {
                Comment comment4 = this.LLJJLIIIJLLLLLLLZ;
                if (comment4 != null && comment4.isAudioTextIsTranslated()) {
                    LJJJJJ(this.LLJLL);
                    this.LLJL = false;
                } else {
                    LJJJJJ(this.LLJLIL);
                    this.LLJL = true;
                }
                setClickable(true);
                C786410Ut5.u(this, 0);
                return;
            }
            if (abstractC1340120kyg2 == null) {
                C786410Ut5.u(this, 8);
                return;
            }
            throw new C1954807lC();
        }
    }

    public C1340290kyx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = "AudioAsrTranslationBtn";
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        this.LLJJJJJIL = numLIZJ != null ? numLIZJ.intValue() : 0;
        this.LLJL = true;
        this.LLJLIL = context.getString(2131829019);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getString(2131829020));
        sbLIZ.append("...");
        this.LLJLILLLLZIIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJLL = context.getString(2131829018);
        View.OnClickListener aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(this, 117);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS155S0100000_21) : aCListenerS155S0100000_21);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
