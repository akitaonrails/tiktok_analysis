package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.servicimpl.EmojiViewServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.IEmojiViewService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19611011o4 extends AbstractC19588311kP<CommentStickerModel> {
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));
    public C1664680tQA<CommentStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    private final TuxTextView getCommentTextView() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getReplyTextView() {
        return (TuxTextView) this.LLJ.getValue();
    }

    public final void LIZLLL() {
        C1664680tQA<CommentStickerModel> c1664680tQA = this.LLILZIL;
        if (c1664680tQA != null) {
            LiveState<V> liveStateLIZ = c1664680tQA.LIZ(new C2217381BqS() { // from class: X.11o5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Float.valueOf(((CommentStickerModel) obj).getAlpha());
                }
            });
            LifecycleOwner lifecycleOwner = this.LLILZLL;
            if (lifecycleOwner == null) {
                lifecycleOwner = null;
            }
            liveStateLIZ.LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 644));
            C1664680tQA<CommentStickerModel> c1664680tQA2 = this.LLILZIL;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            LiveState<V> liveStateLIZ2 = c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11o6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((CommentStickerModel) obj).getVisible());
                }
            });
            LifecycleOwner lifecycleOwner2 = this.LLILZLL;
            liveStateLIZ2.LJIIIZ(lifecycleOwner2 != null ? lifecycleOwner2 : null, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 645));
        }
    }

    public final C424630Gkv getAvatarView() {
        return (C424630Gkv) this.LLIZ.getValue();
    }

    public C19611011o4(Context context) {
        super(0, 14, context, (AttributeSet) null);
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 905));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 906));
        this.LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 907));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d2k, this, true);
    }

    private final void setCommentMsg(String str) {
        IEmojiViewService iEmojiViewService;
        if (C426750GoL.LIZLLL(getContext())) {
            getCommentTextView().setGravity(5);
        }
        getCommentTextView().setText(str);
        Object objLIZ = C04TD.LIZ(IEmojiViewService.class, false);
        if (objLIZ != null) {
            iEmojiViewService = (IEmojiViewService) objLIZ;
        } else {
            if (C04TD.Q4 == null) {
                synchronized (IEmojiViewService.class) {
                    if (C04TD.Q4 == null) {
                        C04TD.Q4 = new EmojiViewServiceImpl();
                    }
                }
            }
            iEmojiViewService = C04TD.Q4;
        }
        iEmojiViewService.LIZ(getCommentTextView());
    }

    private final void setUserAvatar(UrlModel urlModel) {
        C1324750kZt.LJFF(getAvatarView(), urlModel);
    }

    private final void setUserName(String str) {
        if (!TextUtils.isEmpty(str)) {
            getReplyTextView().setText(getContext().getResources().getString(2131846286, str));
        }
    }

    public final void LIZIZ(CommentVideoModel commentVideoModel) {
        UrlModel userAvatar = commentVideoModel.getUserAvatar();
        if (userAvatar != null) {
            setUserAvatar(userAvatar);
        }
        String userName = commentVideoModel.getUserName();
        if (userName != null && (!TextUtils.isEmpty(userName))) {
            setUserName(userName);
        }
        String commentMsg = commentVideoModel.getCommentMsg();
        if (commentMsg != null && (!TextUtils.isEmpty(commentMsg))) {
            setCommentMsg(commentMsg);
        }
    }

    public C19611011o4(C19EG c19eg, C19591211ks c19591211ks) {
        super(0, c19eg, (AttributeSet) null, c19591211ks);
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 905));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 906));
        this.LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 907));
        C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.d2k, this, true);
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LLILZ = interactStickerStruct;
        CommentVideoModel commentStickerModel = ((CommentStickerModel) stickerModel).getCommentStickerModel();
        if (commentStickerModel != null) {
            LIZIZ(commentStickerModel);
        }
        LIZLLL();
    }
}
