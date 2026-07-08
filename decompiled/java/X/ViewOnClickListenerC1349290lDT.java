package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS463S0200000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0lDT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ViewOnClickListenerC1349290lDT extends AbstractC1349310lDV implements InterfaceC1346050l8F, InterfaceC1348780lCe, View.OnClickListener, GenericLifecycleObserver {
    public final Fragment LL;
    public boolean LLILLJJLI;
    public LinearLayout LLILLL;
    public FrameLayout LLILZ;
    public LinearLayout LLILZIL;
    public FrameLayout LLILZLL;
    public LinearLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public TuxIconView LLJ;
    public SmartAvatarImageView LLJI;
    public TuxTextView LLJIJIL;
    public LinearLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxIconView LLJJ;
    public TuxTextView LLJJI;
    public TuxIconView LLJJIII;
    public final String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public C1346030l8D LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public Comment LLJJJJLIIL;
    public Aweme LLJJL;
    public RecyclerView.ViewHolder LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public boolean LLJLIL;
    public Function2<? super String, ? super String, Unit> LLJLILLLLZIIL;
    public Function0<Unit> LLJLL;
    public Function0<Unit> LLJLLIL;
    public int LLJLLL;
    public C19MV LLJZ;
    public C1349350lDZ LLJZIJLIL;
    public EnumC1349330lDX LLL;
    public final C01GW LLLF;

    @Override // X.InterfaceC1348780lCe
    public final boolean checkCommentInputable() {
        return true;
    }

    @Override // X.InterfaceC1348780lCe
    public int getCommentInputViewType() {
        return 9;
    }

    @Override // X.InterfaceC1348780lCe
    public /* bridge */ /* synthetic */ String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public String getEventType() {
        return "notification_page";
    }

    public /* bridge */ /* synthetic */ Comment getForwardComment() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public /* bridge */ /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public /* bridge */ /* synthetic */ String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputClick() {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiClick(String str, int i, int i2) {
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiToKeyboard(String str) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onEvent(C1346240l8Y c1346240l8Y) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy(lifecycleOwner);
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void publishCommentPost(Comment comment, Bitmap bitmap, String str) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void tryTriggerEasterEgg(CommentSurpriseStruct commentSurpriseStruct) {
    }

    private final boolean getMessageButtonEnabled() {
        int i = this.LLJLLL;
        return i == 1 || i == 2;
    }

    private final InterfaceC1349370lDb getNoticeAIQuickReplyManager() {
        return (InterfaceC1349370lDb) this.LLLF.getValue();
    }

    public final FrameLayout getLikeClickAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mnb);
            this.LLILZLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getMessageClickAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.o98);
            this.LLIZLLLIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final LinearLayout getQuickLikeBoxFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.smz);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getQuickLikeIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sn0);
            this.LLJJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getQuickLikeTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sn1);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getQuickMessageBoxFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sn9);
            this.LLIZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getQuickMessageIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sn_);
            this.LLJJIII = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getQuickMessageTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sna);
            this.LLJJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartAvatarImageView getQuickReplyAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.snw);
            this.LLJI = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    public final LinearLayout getQuickReplyBoxFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.snx);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getQuickReplyIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.so2);
            this.LLJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getQuickReplySuggestTextClickAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.soc);
            this.LLJILJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getQuickReplySuggestTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sod);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getQuickReplyTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.soe);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout getReplyClickAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t7e);
            this.LLILZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    @Override // X.InterfaceC1348780lCe
    public Comment getCommentInputReplyComment() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get reply comment ");
        Comment comment = this.LLJJJJLIIL;
        sbLIZ.append(comment != null ? comment.getCid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1348780lCe
    public Aweme getCommentInputAweme() {
        return this.LLJJL;
    }

    public final Fragment getFragment() {
        return this.LL;
    }

    @Override // X.InterfaceC1348780lCe
    public EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.INBOX_QUICK_COMMENT;
    }

    public static String LJI(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "send_message";
            }
            if (num.intValue() == 2) {
                return "view_message";
            }
            return "";
        }
        return "";
    }

    private final void setMessageStyle(Integer num) {
        if (num != null && num.intValue() != 0) {
            if (num.intValue() == 2) {
                C786410Ut5.LJZL(0, getQuickMessageBoxFromXml());
                C786410Ut5.LLLLLLZZ(getQuickMessageIconFromXml(), 8);
                C786410Ut5.LLLLZLL(getQuickMessageTextFromXml(), 0);
                getQuickMessageTextFromXml().setText(getContext().getString(2131827474));
                C426750GoL.LJIIIZ(getQuickMessageTextFromXml(), 0, 0, 0, 0, false, 16);
                float f = (float) 2.5d;
                C426750GoL.LJIIL(getQuickMessageBoxFromXml(), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()))), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()))), 16);
                if (this.LLILLJJLI) {
                    C1351950lHl.LJIJI(C0H9H.LIZIZ(24), getQuickMessageBoxFromXml());
                    getQuickMessageTextFromXml().setTuxFont(71);
                    C426750GoL.LJIIIZ(getQuickMessageTextFromXml(), 0, 0, 0, 0, false, 16);
                    C426750GoL.LJIIL(getQuickMessageBoxFromXml(), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(0)), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(0)), 16);
                }
                LJIIIZ(true);
            } else if (num.intValue() == 1) {
                C786410Ut5.LJZL(0, getQuickMessageBoxFromXml());
                C786410Ut5.LLLLLLZZ(getQuickMessageIconFromXml(), 0);
                C786410Ut5.LLLLZLL(getQuickMessageTextFromXml(), 0);
                getQuickMessageTextFromXml().setText(getContext().getString(2131827473));
                C1351950lHl.LJIJI(C0H9H.LIZIZ(22), getQuickMessageBoxFromXml());
                if (this.LLILLJJLI) {
                    C1351950lHl.LJIJI(C0H9H.LIZIZ(24), getQuickMessageBoxFromXml());
                    getQuickMessageTextFromXml().setTuxFont(71);
                    C426750GoL.LJIIIZ(getQuickMessageTextFromXml(), Integer.valueOf(C0H9H.LIZIZ(4)), 0, 0, 0, false, 16);
                    C426750GoL.LJIIL(getQuickMessageBoxFromXml(), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(0)), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(0)), 16);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_paperplane;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                    C1351950lHl.LJIL(getQuickMessageIconFromXml(), C0H9H.LIZIZ(13));
                    C1351950lHl.LJIJI(C0H9H.LIZIZ(13), getQuickMessageIconFromXml());
                    getQuickMessageIconFromXml().setTuxIcon(c419910GdJ);
                } else {
                    C426750GoL.LJIIIZ(getQuickMessageTextFromXml(), Integer.valueOf(C0H9H.LIZIZ(2)), 0, 0, 0, false, 16);
                    C426750GoL.LJIIL(getQuickMessageBoxFromXml(), Integer.valueOf(C0H9H.LIZIZ(5)), Integer.valueOf(C0H9H.LIZIZ(0)), Integer.valueOf(C0H9H.LIZIZ(6)), Integer.valueOf(C0H9H.LIZIZ(0)), 16);
                }
                LJIIIZ(true);
            }
            if (C0A8N.LIZ()) {
                C1351950lHl.LJIJI(-2, getQuickMessageBoxFromXml());
                LinearLayout quickMessageBoxFromXml = getQuickMessageBoxFromXml();
                int iLIZIZ = C0H9H.LIZIZ(6);
                quickMessageBoxFromXml.setPadding(quickMessageBoxFromXml.getPaddingLeft(), iLIZIZ, quickMessageBoxFromXml.getPaddingRight(), iLIZIZ);
                C1206770hVb.LIZIZ(C0H9H.LIZIZ(6), getMessageClickAreaFromXml());
                return;
            }
            return;
        }
        C786410Ut5.LJZL(8, getQuickMessageBoxFromXml());
        LJIIIZ(false);
    }

    private final void setReplyStyle(boolean z) {
        if (z) {
            C786410Ut5.LLLLLLZZ(getQuickReplyIconFromXml(), 8);
            C786410Ut5.o(getQuickReplyAvatarFromXml(), 8);
            C786410Ut5.LLLLZLL(getQuickReplyTextFromXml(), 0);
            getQuickReplyTextFromXml().setText(getContext().getString(2131845759));
            C426750GoL.LJIIIZ(getQuickReplyTextFromXml(), 0, 0, 0, 0, false, 16);
            float f = (float) 2.5d;
            C426750GoL.LJIIL(getQuickReplyBoxFromXml(), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()))), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()))), 16);
            if (this.LLILLJJLI) {
                C1351950lHl.LJIJI(C0H9H.LIZIZ(24), getQuickReplyBoxFromXml());
                getQuickReplyTextFromXml().setTuxFont(71);
                C426750GoL.LJIIIZ(getQuickReplyTextFromXml(), 0, 0, 0, 0, false, 16);
                C426750GoL.LJIIL(getQuickReplyBoxFromXml(), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(0)), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(0)), 16);
            }
        } else {
            C786410Ut5.LLLLLLZZ(getQuickReplyIconFromXml(), 0);
            C786410Ut5.o(getQuickReplyAvatarFromXml(), 8);
            C786410Ut5.LLLLZLL(getQuickReplyTextFromXml(), 0);
            getQuickReplyTextFromXml().setText(getContext().getString(2131845758));
            C1351950lHl.LJIJI(C0H9H.LIZIZ(22), getQuickReplyBoxFromXml());
            if (this.LLILLJJLI) {
                C1351950lHl.LJIJI(C0H9H.LIZIZ(24), getQuickReplyBoxFromXml());
                getQuickReplyTextFromXml().setTuxFont(71);
                C426750GoL.LJIIIZ(getQuickReplyTextFromXml(), Integer.valueOf(C0H9H.LIZIZ(4)), 0, 0, 0, false, 16);
                C426750GoL.LJIIL(getQuickReplyBoxFromXml(), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(0)), Integer.valueOf(C0H9H.LIZIZ(8)), Integer.valueOf(C0H9H.LIZIZ(0)), 16);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_message;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                C1351950lHl.LJIL(getQuickReplyIconFromXml(), C0H9H.LIZIZ(13));
                C1351950lHl.LJIJI(C0H9H.LIZIZ(13), getQuickReplyIconFromXml());
                getQuickReplyIconFromXml().setTuxIcon(c419910GdJ);
            } else {
                C426750GoL.LJIIIZ(getQuickReplyTextFromXml(), Integer.valueOf(C0H9H.LIZIZ(2)), 0, 0, 0, false, 16);
                C426750GoL.LJIIL(getQuickReplyBoxFromXml(), Integer.valueOf(C0H9H.LIZIZ(5)), Integer.valueOf(C0H9H.LIZIZ(0)), Integer.valueOf(C0H9H.LIZIZ(6)), Integer.valueOf(C0H9H.LIZIZ(0)), 16);
            }
        }
        if (C0A8N.LIZ()) {
            C1351950lHl.LJIJI(-2, getQuickReplyBoxFromXml());
            LinearLayout quickReplyBoxFromXml = getQuickReplyBoxFromXml();
            int iLIZIZ = C0H9H.LIZIZ(6);
            quickReplyBoxFromXml.setPadding(quickReplyBoxFromXml.getPaddingLeft(), iLIZIZ, quickReplyBoxFromXml.getPaddingRight(), iLIZIZ);
            C1206770hVb.LIZIZ(C0H9H.LIZIZ(6), getReplyClickAreaFromXml());
        }
    }

    @Override // X.AbstractC1349310lDV
    public final void LIZ(AwS429S0200000_28 awS429S0200000_28) {
        this.LLJLL = awS429S0200000_28;
    }

    @Override // X.AbstractC1349310lDV
    public final void LIZIZ(AwS429S0200000_28 awS429S0200000_28) {
        this.LLJLLIL = awS429S0200000_28;
    }

    @Override // X.AbstractC1349310lDV
    public final void LJFF(AwS463S0200000_28 awS463S0200000_28) {
        this.LLJLILLLLZIIL = awS463S0200000_28;
    }

    public final void LJIIIZ(boolean z) {
        C19MV c19mv;
        C19ME c19me;
        LinearLayout.LayoutParams layoutParams;
        C19ME c19me2;
        LinearLayout.LayoutParams layoutParams2;
        if (!C297160Bko.LIZ() || (c19mv = this.LLJZ) == null) {
            return;
        }
        if (z) {
            c19mv.setWrapMode(1);
            c19mv.setReferencedIds(new int[]{R.id.mnb, R.id.t7e, R.id.o98});
            TuxTextView quickReplyTextFromXml = getQuickReplyTextFromXml();
            if (quickReplyTextFromXml != null) {
                ViewGroup.LayoutParams layoutParams3 = quickReplyTextFromXml.getLayoutParams();
                if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams3) != null) {
                    layoutParams2.width = -2;
                    layoutParams2.weight = 0.0f;
                }
                quickReplyTextFromXml.setEllipsize(null);
            }
            FrameLayout replyClickAreaFromXml = getReplyClickAreaFromXml();
            if (replyClickAreaFromXml != null) {
                ViewGroup.LayoutParams layoutParams4 = replyClickAreaFromXml.getLayoutParams();
                if ((layoutParams4 instanceof C19ME) && (c19me2 = (C19ME) layoutParams4) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me2).width = -2;
                    c19me2.horizontalWeight = -1.0f;
                    c19me2.matchConstraintDefaultWidth = 0;
                    return;
                }
                return;
            }
            return;
        }
        c19mv.setWrapMode(0);
        c19mv.setReferencedIds(new int[]{R.id.mnb, R.id.t7e});
        TuxTextView quickReplyTextFromXml2 = getQuickReplyTextFromXml();
        if (quickReplyTextFromXml2 != null) {
            ViewGroup.LayoutParams layoutParams5 = quickReplyTextFromXml2.getLayoutParams();
            if ((layoutParams5 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams5) != null) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            quickReplyTextFromXml2.setEllipsize(TextUtils.TruncateAt.END);
        }
        FrameLayout replyClickAreaFromXml2 = getReplyClickAreaFromXml();
        if (replyClickAreaFromXml2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams6 = replyClickAreaFromXml2.getLayoutParams();
        if (!(layoutParams6 instanceof C19ME) || (c19me = (C19ME) layoutParams6) == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) c19me).width = 0;
        c19me.horizontalWeight = 1.0f;
        c19me.matchConstraintDefaultWidth = 1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1346050l8F
    public final void N31(Object... objArr) {
        String cid;
        String noticeRepliedCid;
        Comment comment = this.LLJJJJLIIL;
        if (comment != null && objArr.length > 1) {
            String str = (String) objArr[1];
            comment.setUserDigged(TextUtils.equals(str, "1") ? 1 : 0);
            C1349300lDU c1349300lDU = C1349300lDU.LIZ;
            Aweme aweme = this.LLJJL;
            Comment comment2 = this.LLJJJJLIIL;
            String str2 = this.LLJJJ;
            String str3 = this.LLJJJIL;
            String str4 = this.LLJL;
            c1349300lDU.getClass();
            if (aweme != null && comment2 != null) {
                C1347300lAG.LIZJ(str2, "inbox_like_box", aweme, true, false, str, "", "", null, "", "", "", null, comment2, null, str3, "click_button", str4, false);
            }
            C1440005kM.LIZ(new C586110Myn(comment.getCid(), comment.getUserDigged(), "inbox"));
            Comment comment3 = this.LLJJJJLIIL;
            String aid = null;
            if (comment3 != null) {
                cid = comment3.getCid();
            } else {
                cid = null;
            }
            Comment comment4 = this.LLJJJJLIIL;
            if (comment4 == null || (noticeRepliedCid = comment4.getNoticeRepliedCid()) == null) {
                noticeRepliedCid = "";
            }
            C1349300lDU.LIZLLL(comment.getUserDigged(), cid, noticeRepliedCid);
            Aweme aweme2 = this.LLJJL;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            }
            C1344480l5i.LIZ(aid, null, false);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:158:0x03c1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r39) {
        /*
            Method dump skipped, instruction units count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1349290lDT.onClick(android.view.View):void");
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishStart(Comment comment) {
        this.LLJLIL = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C622680Oba.LIZJ(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C622680Oba.LIZLLL(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDiggChangeEventReceive(C586110Myn c586110Myn) {
        String noticeRepliedCid;
        if (c586110Myn == null) {
            return;
        }
        String str = c586110Myn.LIZ;
        int i = c586110Myn.LIZIZ;
        Comment comment = this.LLJJJJLIIL;
        if (comment != null) {
            String cid = null;
            if (Intrinsics.LJFF(comment.getCid(), str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateDiggState, comment:");
                sbLIZ.append(comment);
                sbLIZ.append(", is digg: ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                comment.setUserDigged(i);
                if (this.LLJJIJIIJIL != comment.isUserDigged()) {
                    boolean zIsUserDigged = comment.isUserDigged();
                    this.LLJJIJIIJIL = zIsUserDigged;
                    LJII(zIsUserDigged, true);
                }
                C1349300lDU c1349300lDU = C1349300lDU.LIZ;
                Comment comment2 = this.LLJJJJLIIL;
                if (comment2 != null) {
                    cid = comment2.getCid();
                }
                Comment comment3 = this.LLJJJJLIIL;
                if (comment3 == null || (noticeRepliedCid = comment3.getNoticeRepliedCid()) == null) {
                    noticeRepliedCid = "";
                }
                c1349300lDU.getClass();
                C1349300lDU.LIZLLL(i, cid, noticeRepliedCid);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMessageButtonChangeEvent(C889400Yuo c889400Yuo) {
        String uid;
        String noticeRepliedCid;
        int userDigged;
        User user;
        String str = c889400Yuo.LIZ;
        Comment comment = this.LLJJJJLIIL;
        String cid = null;
        if (comment != null && (user = comment.getUser()) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(str, uid)) {
            this.LLJLLL = 2;
            setMessageStyle(2);
            C1349300lDU c1349300lDU = C1349300lDU.LIZ;
            Comment comment2 = this.LLJJJJLIIL;
            if (comment2 != null) {
                cid = comment2.getCid();
            }
            Comment comment3 = this.LLJJJJLIIL;
            if (comment3 == null || (noticeRepliedCid = comment3.getNoticeRepliedCid()) == null) {
                noticeRepliedCid = "";
            }
            Comment comment4 = this.LLJJJJLIIL;
            if (comment4 != null) {
                userDigged = comment4.getUserDigged();
            } else {
                userDigged = 0;
            }
            c1349300lDU.getClass();
            C1349300lDU.LIZLLL(userDigged, cid, noticeRepliedCid);
            String str2 = c889400Yuo.LIZ;
            if (str2 != null) {
                C1349300lDU.LIZJ.LIZLLL(str2, Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReplyChangeEvent(C1344020l4y c1344020l4y) {
        String cid;
        String cid2;
        int userDigged = 0;
        String noticeRepliedCid = null;
        Integer numValueOf = null;
        if (c1344020l4y.LIZ) {
            String str = c1344020l4y.LIZIZ;
            if (str == null || c1344020l4y.LIZJ == null) {
                return;
            }
            Comment comment = this.LLJJJJLIIL;
            if (comment != null) {
                cid = comment.getCid();
            } else {
                cid = null;
            }
            if (Intrinsics.LJFF(str, cid)) {
                Comment comment2 = this.LLJJJJLIIL;
                if (comment2 != null) {
                    comment2.setNoticeRepliedCid(c1344020l4y.LIZJ);
                }
                setReplyStyle(true);
                LJIIIIZZ(this.LLJZIJLIL, true);
                C1349300lDU c1349300lDU = C1349300lDU.LIZ;
                Comment comment3 = this.LLJJJJLIIL;
                if (comment3 != null) {
                    cid2 = comment3.getCid();
                } else {
                    cid2 = null;
                }
                String str2 = c1344020l4y.LIZJ;
                Comment comment4 = this.LLJJJJLIIL;
                if (comment4 != null) {
                    userDigged = comment4.getUserDigged();
                }
                c1349300lDU.getClass();
                C1349300lDU.LIZLLL(userDigged, cid2, str2);
                String str3 = this.LLJJJ;
                String str4 = this.LLJJIJIL;
                String str5 = this.LLJJJIL;
                C1349350lDZ c1349350lDZ = this.LLJZIJLIL;
                if (c1349350lDZ != null) {
                    numValueOf = Integer.valueOf(c1349350lDZ.LIZ);
                }
                C1349300lDU.LIZIZ(numValueOf, str3, str4, "view_reply", str5, null, false);
                return;
            }
            return;
        }
        String str6 = c1344020l4y.LIZJ;
        Comment comment5 = this.LLJJJJLIIL;
        if (comment5 != null) {
            noticeRepliedCid = comment5.getNoticeRepliedCid();
        }
        if (Intrinsics.LJFF(str6, noticeRepliedCid)) {
            Comment comment6 = this.LLJJJJLIIL;
            if (comment6 != null) {
                comment6.setNoticeRepliedCid("");
            }
            setReplyStyle(false);
        }
    }

    public final void setInboxUIRemapStyle(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setLikeClickAreaFromXml(FrameLayout frameLayout) {
        this.LLILZLL = frameLayout;
    }

    public final void setMessageClickAreaFromXml(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    public final void setQuickLikeBoxFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setQuickLikeIconFromXml(TuxIconView tuxIconView) {
        this.LLJJ = tuxIconView;
    }

    public final void setQuickLikeTextFromXml(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setQuickMessageBoxFromXml(LinearLayout linearLayout) {
        this.LLIZ = linearLayout;
    }

    public final void setQuickMessageIconFromXml(TuxIconView tuxIconView) {
        this.LLJJIII = tuxIconView;
    }

    public final void setQuickMessageTextFromXml(TuxTextView tuxTextView) {
        this.LLJJI = tuxTextView;
    }

    public final void setQuickReplyAvatarFromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLJI = smartAvatarImageView;
    }

    public final void setQuickReplyBoxFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setQuickReplyIconFromXml(TuxIconView tuxIconView) {
        this.LLJ = tuxIconView;
    }

    public final void setQuickReplySuggestTextClickAreaFromXml(LinearLayout linearLayout) {
        this.LLJILJIL = linearLayout;
    }

    public final void setQuickReplySuggestTextFromXml(TuxTextView tuxTextView) {
        this.LLJILJILJ = tuxTextView;
    }

    public final void setQuickReplyTextFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setReplyClickAreaFromXml(FrameLayout frameLayout) {
        this.LLILZ = frameLayout;
    }

    public ViewOnClickListenerC1349290lDT(Fragment fragment, Context context) {
        int i;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super(context, null, 0);
        this.LL = fragment;
        this.LLILLJJLI = true;
        this.LLJJIJI = "quick_comment_like";
        this.LLJJJ = "";
        this.LLJJJIL = "";
        this.LLL = EnumC1349330lDX.GONE;
        this.LLLF = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(462));
        FrameLayout.inflate(getContext(), R.layout.a4d, this);
        C19MV c19mv = (C19MV) findViewById(R.id.d8_);
        this.LLJZ = c19mv;
        this.LLJJJJJIL = (TuxIconView) findViewById(R.id.sn0);
        LinearLayout quickReplyBoxFromXml = getQuickReplyBoxFromXml();
        C384050F3z c384050F3z = new C384050F3z();
        Integer numValueOf = Integer.valueOf(R.attr.br);
        c384050F3z.LIZIZ = numValueOf;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(36));
        quickReplyBoxFromXml.setBackground(c384050F3z.LIZ(getContext()));
        if (((Number) C0A8P.LIZ.getValue()).intValue() == 1) {
            c19mv.setReferencedIds(new int[]{R.id.mnb, R.id.t7e, R.id.o98});
        } else {
            c19mv.setReferencedIds(new int[]{R.id.t7e, R.id.mnb, R.id.o98});
        }
        LinearLayout quickMessageBoxFromXml = getQuickMessageBoxFromXml();
        if (getMessageButtonEnabled()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, quickMessageBoxFromXml);
        C786410Ut5.O7(getReplyClickAreaFromXml(), this);
        C786410Ut5.R7(getQuickReplySuggestTextClickAreaFromXml(), this);
        C632780Ors.LIZ(getQuickReplySuggestTextClickAreaFromXml(), 0, 0, C0H9H.LIZIZ(8), 0);
        C1387040mCM.LIZ(getReplyClickAreaFromXml(), AFwS289S0000000_6.get$arr$(33));
        LinearLayout quickLikeBoxFromXml = getQuickLikeBoxFromXml();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = numValueOf;
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(36));
        quickLikeBoxFromXml.setBackground(c384050F3z2.LIZ(getContext()));
        C786410Ut5.O7(getLikeClickAreaFromXml(), this);
        C1387040mCM.LIZ(getLikeClickAreaFromXml(), AFwS289S0000000_6.get$arr$(34));
        LinearLayout quickMessageBoxFromXml2 = getQuickMessageBoxFromXml();
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZIZ = numValueOf;
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(36));
        quickMessageBoxFromXml2.setBackground(c384050F3z3.LIZ(getContext()));
        C786410Ut5.O7(getMessageClickAreaFromXml(), this);
        C1387040mCM.LIZ(getMessageClickAreaFromXml(), AFwS289S0000000_6.get$arr$(35));
        Object context2 = getContext();
        if ((context2 instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context2) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    public final void LJII(boolean z, boolean z2) {
        TuxIconView tuxIconView;
        if (z2 && (tuxIconView = this.LLJJJJJIL) != null) {
            tuxIconView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80L).withEndAction(new ARunnableS106S0100000_6((Object) tuxIconView, 39)).start();
        }
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_heart_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
            TuxIconView tuxIconView2 = this.LLJJJJJIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setTuxIcon(c419910GdJ);
                return;
            }
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_heart;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
        TuxIconView tuxIconView3 = this.LLJJJJJIL;
        if (tuxIconView3 == null) {
            return;
        }
        tuxIconView3.setTuxIcon(c419910GdJ2);
    }

    public final void LJIIIIZZ(C1349350lDZ c1349350lDZ, boolean z) {
        boolean z2;
        String text;
        List<String> listLIZ;
        String str;
        LJIIJ(c1349350lDZ, EnumC1349330lDX.GONE);
        if (C297160Bko.LIZ() && c1349350lDZ != null && !z) {
            int i = c1349350lDZ.LIZ;
            if (i != 1) {
                if (i == 2) {
                    InterfaceC1349370lDb noticeAIQuickReplyManager = getNoticeAIQuickReplyManager();
                    if (noticeAIQuickReplyManager != null && noticeAIQuickReplyManager.hasCache(String.valueOf(this.LLJL))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String text2 = null;
                    if (z2) {
                        InterfaceC1349370lDb noticeAIQuickReplyManager2 = getNoticeAIQuickReplyManager();
                        if (noticeAIQuickReplyManager2 != null) {
                            listLIZ = noticeAIQuickReplyManager2.LIZ(String.valueOf(this.LLJL));
                        } else {
                            listLIZ = null;
                        }
                        c1349350lDZ.LIZLLL = listLIZ;
                        if (listLIZ != null) {
                            str = (String) C13LP.LJJJLL(listLIZ);
                        } else {
                            str = null;
                        }
                        c1349350lDZ.LIZJ = str;
                        if (listLIZ != null) {
                            text2 = (String) C13LP.LJJJLL(listLIZ);
                        }
                        c1349350lDZ.LIZIZ = text2;
                        LJIIJ(c1349350lDZ, EnumC1349330lDX.VISIBLE);
                        return;
                    }
                    LJIIJ(c1349350lDZ, EnumC1349330lDX.LOADING);
                    InterfaceC1349370lDb noticeAIQuickReplyManager3 = getNoticeAIQuickReplyManager();
                    if (noticeAIQuickReplyManager3 == null) {
                        return;
                    }
                    String strValueOf = String.valueOf(this.LLJL);
                    Pair[] pairArr = new Pair[2];
                    Comment comment = this.LLJJJJLIIL;
                    if (comment != null) {
                        text2 = comment.getText();
                    }
                    String str2 = "";
                    if (text2 == null) {
                        text2 = "";
                    }
                    pairArr[0] = new Pair("text", text2);
                    Comment comment2 = this.LLJJJJLIIL;
                    if (comment2 != null && (text = comment2.getText()) != null) {
                        str2 = text;
                    }
                    pairArr[1] = new Pair("llm_prompt_parameter", Collections.singletonList(str2));
                    noticeAIQuickReplyManager3.LIZIZ(strValueOf, C2097608Jq.LJIIIIZZ(pairArr), new C1349340lDY(c1349350lDZ, this));
                    return;
                }
                return;
            }
            LJIIJ(c1349350lDZ, EnumC1349330lDX.VISIBLE);
        }
    }

    public final void LJIIJ(C1349350lDZ c1349350lDZ, EnumC1349330lDX enumC1349330lDX) {
        String str;
        String str2 = null;
        if (enumC1349330lDX == EnumC1349330lDX.VISIBLE && (c1349350lDZ == null || (str = c1349350lDZ.LIZIZ) == null || str.length() == 0)) {
            enumC1349330lDX = EnumC1349330lDX.GONE;
        }
        this.LLL = enumC1349330lDX;
        int i = C1349320lDW.LIZ[enumC1349330lDX.ordinal()];
        if (i != 1) {
            if (i != 2) {
                C786410Ut5.LJLLLLLL(8, getQuickReplySuggestTextClickAreaFromXml());
                return;
            }
            C786410Ut5.LJLLLLLL(0, getQuickReplySuggestTextClickAreaFromXml());
            TuxTextView quickReplySuggestTextFromXml = getQuickReplySuggestTextFromXml();
            if (c1349350lDZ != null) {
                str2 = c1349350lDZ.LIZIZ;
            }
            quickReplySuggestTextFromXml.setText(str2);
            return;
        }
        C786410Ut5.LJLLLLLL(0, getQuickReplySuggestTextClickAreaFromXml());
        getQuickReplySuggestTextFromXml().setText((CharSequence) null);
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputKeyboardDismiss(boolean z, C1347310lAH c1347310lAH) {
        InterfaceC1349380lDc interfaceC1349380lDc;
        C128Y c128y = this.LL;
        if ((c128y instanceof InterfaceC1349380lDc) && (interfaceC1349380lDc = (InterfaceC1349380lDc) c128y) != null) {
            interfaceC1349380lDc.Qf(this.LLJJLIIIJLLLLLLLZ, false);
        }
    }

    @Override // X.AbstractC1349310lDV
    public final void LIZLLL(String str, String str2, String str3) {
        boolean z;
        String noticeRepliedCid;
        String str4;
        String cid;
        Integer numValueOf;
        C1349350lDZ c1349350lDZ = this.LLJZIJLIL;
        if (c1349350lDZ != null && c1349350lDZ.LIZ != 0) {
            z = true;
        } else {
            z = false;
        }
        Comment comment = this.LLJJJJLIIL;
        Integer numValueOf2 = null;
        if (comment != null) {
            noticeRepliedCid = comment.getNoticeRepliedCid();
        } else {
            noticeRepliedCid = null;
        }
        if (C703302op.LIZ(noticeRepliedCid)) {
            str4 = "view_reply";
            z = false;
        } else {
            str4 = "reply";
        }
        C1349300lDU c1349300lDU = C1349300lDU.LIZ;
        Comment comment2 = this.LLJJJJLIIL;
        if (comment2 != null) {
            cid = comment2.getCid();
        } else {
            cid = null;
        }
        C1349350lDZ c1349350lDZ2 = this.LLJZIJLIL;
        if (c1349350lDZ2 != null) {
            numValueOf = Integer.valueOf(c1349350lDZ2.LIZ);
        } else {
            numValueOf = null;
        }
        c1349300lDU.getClass();
        C1349300lDU.LIZIZ(numValueOf, str, str2, str4, str3, cid, z);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("position", str2);
        c2344009Gk.LJIIIIZZ("account_type", str3);
        C20684815ws.LJIILLIIL("show_like_comment_button", c2344009Gk.LIZ);
        if (getMessageButtonEnabled()) {
            String strLJI = LJI(Integer.valueOf(this.LLJLLL));
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            c2344009Gk2.LJIIIIZZ("position", str2);
            c2344009Gk2.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, strLJI);
            c2344009Gk2.LJIIIIZZ("account_type", str3);
            C20684815ws.LJIILLIIL("show_comment_dm_button", c2344009Gk2.LIZ);
        }
        if (this.LLL != EnumC1349330lDX.GONE) {
            Aweme aweme = this.LLJJL;
            Comment comment3 = this.LLJJJJLIIL;
            C1349350lDZ c1349350lDZ3 = this.LLJZIJLIL;
            if (c1349350lDZ3 != null) {
                numValueOf2 = Integer.valueOf(c1349350lDZ3.LIZ);
            }
            C1349300lDU.LIZJ(aweme, comment3, str, "show", numValueOf2);
        }
        this.LLJJIJIL = str2;
        this.LLJJJ = str;
        this.LLJJJIL = str3;
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputKeyboardShow(boolean z, String str, C1347310lAH c1347310lAH) {
        boolean z2;
        InterfaceC1349380lDc interfaceC1349380lDc;
        Aweme aweme = this.LLJJL;
        Comment comment = this.LLJJJJLIIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fromPage", c1347310lAH.LIZIZ);
        linkedHashMap.put("enterFrom", "notification_page");
        linkedHashMap.put("aweme", aweme);
        linkedHashMap.put("clickFrom", str);
        linkedHashMap.put("fromLocation", c1347310lAH.LIZ);
        linkedHashMap.put("sessionId", null);
        if (c1347310lAH.LJIILJJIL == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        linkedHashMap.put("isFromGuideReplyUser", Boolean.valueOf(z2));
        linkedHashMap.put("quickCommentActionType", null);
        linkedHashMap.put("splitPercent", null);
        CommentContextSource commentContextSourceLIZ = C1347300lAG.LIZ(linkedHashMap);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        Boolean bool = Boolean.TRUE;
        c1350920lG6.getClass();
        C1350920lG6.LJLL(commentContextSourceLIZ, comment, bool, null);
        C128Y c128y = this.LL;
        if ((c128y instanceof InterfaceC1349380lDc) && (interfaceC1349380lDc = (InterfaceC1349380lDc) c128y) != null) {
            interfaceC1349380lDc.Qf(this.LLJJLIIIJLLLLLLLZ, true);
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        List<CommentImageStruct> imageList;
        int iLJIIL = 0;
        this.LLJLIL = false;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        Aweme aweme = this.LLJJL;
        Comment comment2 = this.LLJJJJLIIL;
        String str = this.LLJJJIL;
        String str2 = this.LLJL;
        if (comment != null && (imageList = comment.getImageList()) != null) {
            iLJIIL = C1351950lHl.LJIIL(imageList);
        }
        Integer numValueOf = Integer.valueOf(iLJIIL);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.FALSE;
        c1350920lG6.getClass();
        C1350920lG6.LJZ("notification_page", "inbox_reply_box", aweme, comment2, false, null, null, bool, null, str, null, str2, null, null, null, numValueOf, bool2, null, null, null, null, 0, null, null);
        if (exc != null && comment != null) {
            C0XTN.LIZJ(getContext(), exc, 2131829223, false, false);
            String str3 = this.LLJJIJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCommentInputPublishFailed requestType:");
            sbLIZ.append(i);
            sbLIZ.append(" comment:");
            sbLIZ.append(comment.getCid());
            sbLIZ.append(' ');
            C1344030l4z.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ), exc);
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishSuccess(Comment comment, boolean z, CommentResponse commentResponse) {
        Aweme commentInputAweme;
        int iLJIIL = 0;
        this.LLJLIL = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCommentInputPublishSuccess comment:");
        sbLIZ.append(comment.getCid());
        C2188811AlT.LIZIZ(sbLIZ);
        String awemeId = comment.getAwemeId();
        String cid = null;
        if (awemeId == null && ((commentInputAweme = getCommentInputAweme()) == null || (awemeId = commentInputAweme.getAid()) == null)) {
            awemeId = "";
        }
        C1233040iBy c1233040iBy = new C1233040iBy(getContext());
        c1233040iBy.LIZIZ(2131829203);
        c1233040iBy.LIZLLL();
        C1209980ham c1209980ham = new C1209980ham(3, new Object[]{awemeId, comment.m169clone()});
        c1209980ham.LIZLLL = Integer.valueOf(hashCode());
        C1440005kM.LIZ(c1209980ham);
        Comment comment2 = this.LLJJJJLIIL;
        if (comment2 != null) {
            cid = comment2.getCid();
        }
        C1440005kM.LIZ(new C1344020l4y(true, cid, comment.getCid()));
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        Aweme aweme = this.LLJJL;
        Comment comment3 = this.LLJJJJLIIL;
        String str = this.LLJJJIL;
        String str2 = this.LLJL;
        List<CommentImageStruct> imageList = comment.getImageList();
        if (imageList != null) {
            iLJIIL = C1351950lHl.LJIIL(imageList);
        }
        Integer numValueOf = Integer.valueOf(iLJIIL);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.FALSE;
        c1350920lG6.getClass();
        C1350920lG6.LJZ("notification_page", "inbox_reply_box", aweme, comment3, true, null, null, bool, null, str, null, str2, null, null, null, numValueOf, bool2, null, null, null, null, 0, null, null);
    }

    @Override // X.InterfaceC1346050l8F
    public final void q40(String str, String str2, Exception exc) {
        if (exc != null) {
            String str3 = this.LLJJIJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDiggFailed cid:");
            sbLIZ.append(str);
            sbLIZ.append(" diggType:");
            sbLIZ.append(str2);
            sbLIZ.append(' ');
            C1344030l4z.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ), exc);
        }
        Comment comment = this.LLJJJJLIIL;
        if (comment != null) {
            Intrinsics.LJFF(comment.getCid(), str);
        }
        boolean z = !this.LLJJIJIIJIL;
        this.LLJJIJIIJIL = z;
        LJII(z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    @Override // X.InterfaceC1348780lCe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCommentInputPublishClick(int r34, int r35, java.lang.CharSequence r36, java.lang.String r37, java.lang.String r38, boolean r39, X.C1347310lAH r40) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1349290lDT.onCommentInputPublishClick(int, int, java.lang.CharSequence, java.lang.String, java.lang.String, boolean, X.0lAH):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fe  */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.0iur, X.0l8D] */
    @Override // X.AbstractC1349310lDV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.comment.model.Comment r16, com.ss.android.ugc.aweme.feed.model.Aweme r17, androidx.recyclerview.widget.RecyclerView.ViewHolder r18, java.lang.String r19, java.lang.String r20, java.lang.Integer r21, java.lang.Long r22, X.C1349350lDZ r23) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1349290lDT.LIZJ(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.feed.model.Aweme, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, X.0lDZ):void");
    }
}
