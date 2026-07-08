package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19578811is extends AbstractC19588311kP<SharedCommentStickerModel> {
    public static final float LLJ = C418440Gaw.LIZIZ(6);
    public static final float LLJI = C418440Gaw.LIZIZ(Float.valueOf(0.5f));
    public static final float LLJIJIL = C418440Gaw.LIZIZ(Float.valueOf(1.0f));
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    private final TuxTextView getAuthorNameTv() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    private final SmartImageView getCommentImageView() {
        return (SmartImageView) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getCommentMessageTv() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    public final C424630Gkv getAvatarIv() {
        return (C424630Gkv) this.LLILZIL.getValue();
    }

    public final void LIZIZ(CommentVideoModel commentVideoModel, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        float width;
        float f;
        C1331100kk8 c1331100kk8;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        UrlModel userAvatar = commentVideoModel.getUserAvatar();
        if (userAvatar != null) {
            if (z) {
                try {
                    C23250099c.LJ(C23271099x.INSTANCE, new C09JW(this, userAvatar, null));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                getAvatarIv().LLIZLLLIL = true;
            } else {
                C1324750kZt.LJI(getAvatarIv(), userAvatar, -1, -1);
            }
        }
        String commentMsg = commentVideoModel.getCommentMsg();
        int iIntValue = 0;
        if (commentMsg != null && !a0.LJJJIL(commentMsg)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z4 = !z2;
        List<UrlModel> imageList = commentVideoModel.getImageList();
        if (imageList != null && !imageList.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z5 = !z3;
        if (!z4) {
            C786410Ut5.LLLLZLL(getCommentMessageTv(), 8);
        } else {
            C786410Ut5.LLLLZLL(getCommentMessageTv(), 0);
            getCommentMessageTv().setText(commentVideoModel.getCommentMsg());
            TuxTextView commentMessageTv = getCommentMessageTv();
            if (z5) {
                i = 2;
            } else {
                i = 4;
            }
            commentMessageTv.setMaxLines(i);
        }
        String userName = commentVideoModel.getUserName();
        if (userName != null) {
            getAuthorNameTv().setText(getContext().getString(2131824824, userName));
        }
        if (z5) {
            List<UrlModel> imageList2 = commentVideoModel.getImageList();
            if (imageList2 != null) {
                UrlModel urlModel = (UrlModel) C13LP.LJJJJZI(imageList2);
                C786410Ut5.LLFF(0, getCommentImageView());
                if (urlModel.getWidth() > 0 && urlModel.getHeight() > 0) {
                    width = urlModel.getWidth() / urlModel.getHeight();
                } else {
                    width = 1.0f;
                }
                float fLIZLLL = C13LZ.LIZLLL(width, 0.75f, 1.3333334f);
                if (z4) {
                    f = 3888.0f;
                } else {
                    f = 6912.0f;
                }
                Pair pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C814420VxA.LIZIZ((float) Math.sqrt(f * fLIZLLL)))))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C814420VxA.LIZIZ((float) Math.sqrt(f / fLIZLLL)))))));
                int iIntValue2 = ((Number) pair.getFirst()).intValue();
                int iIntValue3 = ((Number) pair.getSecond()).intValue();
                SmartImageView commentImageView = getCommentImageView();
                ViewGroup.LayoutParams layoutParams = getCommentImageView().getLayoutParams();
                layoutParams.width = iIntValue2;
                layoutParams.height = iIntValue3;
                C786410Ut5.G6(commentImageView, layoutParams);
                ViewGroup.LayoutParams layoutParams2 = getCommentImageView().getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    if (z4) {
                        i2 = 8;
                    } else {
                        i2 = 10;
                    }
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
                }
                if (z) {
                    SmartImageView commentImageView2 = getCommentImageView();
                    commentImageView2.setForeground(new Drawable(this) { // from class: X.0GQq
                        public final Paint LIZ;
                        public final RectF LIZIZ;

                        @Override // android.graphics.drawable.Drawable
                        public final int getOpacity() {
                            return -3;
                        }

                        {
                            int iIntValue4;
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(C19578811is.LLJIJIL);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.getContext());
                            if (numLIZJ != null) {
                                iIntValue4 = numLIZJ.intValue();
                            } else {
                                iIntValue4 = 0;
                            }
                            paint.setColor(iIntValue4);
                            this.LIZ = paint;
                            this.LIZIZ = new RectF();
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            float f2 = C19578811is.LLJIJIL / 2.0f;
                            this.LIZIZ.set(getBounds().left + f2, getBounds().top + f2, getBounds().right - f2, getBounds().bottom - f2);
                            RectF rectF = this.LIZIZ;
                            float f3 = C19578811is.LLJ;
                            canvas.drawRoundRect(rectF, f3, f3, this.LIZ);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i3) {
                            this.LIZ.setAlpha(i3);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                            this.LIZ.setColorFilter(colorFilter);
                        }
                    });
                    try {
                        C23250099c.LJ(C23271099x.INSTANCE, new C09JX(commentImageView2, urlModel, null));
                        return;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C786410Ut5.LLZZLLIL(commentImageView2, 8);
                        return;
                    }
                }
                SmartImageView commentImageView3 = getCommentImageView();
                C1331070kk5 hierarchy = commentImageView3.getHierarchy();
                if (hierarchy == null || (c1331100kk8 = hierarchy.LIZJ) == null) {
                    c1331100kk8 = new C1331100kk8();
                }
                c1331100kk8.LJII(LLJ);
                c1331100kk8.LJFF(LLJI);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                c1331100kk8.LJFF = iIntValue;
                C1331070kk5 hierarchy2 = commentImageView3.getHierarchy();
                if (hierarchy2 != null) {
                    hierarchy2.LJJIII(c1331100kk8);
                }
                C1324750kZt.LJI(getCommentImageView(), urlModel, -1, -1);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C786410Ut5.LLFF(8, getCommentImageView());
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LLILZ = interactStickerStruct;
    }

    public C19578811is(int i, Context context, C19591211ks c19591211ks) {
        super(0, context, (AttributeSet) null, (i & 8) != 0 ? null : c19591211ks);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d8k, this, true);
        this.LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 933));
        this.LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 932));
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 935));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 934));
    }
}
