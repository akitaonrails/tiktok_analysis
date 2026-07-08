package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.model.SearchInteractionModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS73S0100000_33;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1A5Q, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5Q extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public C1A5S LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public Function1<? super C1A5S, Unit> LLJI;
    public Function1<? super C1A5S, Unit> LLJIJIL;

    private final Drawable getButtonBackground() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1e, getContext());
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
        return c384050F3z.LIZ(getContext());
    }

    private final TuxIconView getDislikeButton() {
        return (TuxIconView) this.LLILZLL.getValue();
    }

    private final Gson getGsonProvider() {
        return (Gson) this.LLILLJJLI.getValue();
    }

    private final TuxIconView getLikeButton() {
        return (TuxIconView) this.LLILZIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C1A5S getLikeStateFromStorage() {
        /*
            r5 = this;
            java.lang.String r1 = r5.LLIZLLLIL
            r4 = 0
            if (r1 == 0) goto L5d
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L5d
            X.0ymf r0 = r5.getStorage()
            java.lang.Object r3 = r0.LIZ(r1)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L5d
            java.lang.String r3 = (java.lang.String) r3
        L19:
            com.google.gson.Gson r1 = r5.getGsonProvider()
            java.lang.Class<com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.model.SearchInteractionModel> r0 = com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.model.SearchInteractionModel.class
            java.lang.Object r2 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r3, r0)
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.model.SearchInteractionModel r2 = (com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.model.SearchInteractionModel) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getLikeStateFromStorage, stateJson ="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", interactionModel = "
            r1.append(r0)
            if (r2 == 0) goto L5b
            int r0 = r2.likeStatus
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L3e:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r2 == 0) goto L4c
            int r0 = r2.likeStatus
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L4c:
            X.1A5S r2 = X.C1A5S.LIKE
            int r1 = r2.getState()
            if (r4 == 0) goto L5f
            int r0 = r4.intValue()
            if (r0 != r1) goto L5f
            return r2
        L5b:
            r0 = r4
            goto L3e
        L5d:
            r3 = r4
            goto L19
        L5f:
            X.1A5S r2 = X.C1A5S.DISLIKE
            int r1 = r2.getState()
            if (r4 == 0) goto L6e
            int r0 = r4.intValue()
            if (r0 != r1) goto L6e
            return r2
        L6e:
            X.1A5S r2 = X.C1A5S.DEFAULT
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A5Q.getLikeStateFromStorage():X.1A5S");
    }

    private final InterfaceC1870830ymf getStorage() {
        return (InterfaceC1870830ymf) this.LL.getValue();
    }

    public final View getLayout() {
        return (View) this.LLILZ.getValue();
    }

    public final void LIZIZ() {
        LIZ(getLikeStateFromStorage());
    }

    private final void setLikeStateToStorage(C1A5S c1a5s) {
        SearchInteractionModel searchInteractionModel;
        if (!this.LLJ) {
            return;
        }
        int i = C1A5R.LIZ[c1a5s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                searchInteractionModel = new SearchInteractionModel(C1A5S.DEFAULT.getState());
            } else {
                searchInteractionModel = new SearchInteractionModel(C1A5S.DISLIKE.getState());
            }
        } else {
            searchInteractionModel = new SearchInteractionModel(C1A5S.LIKE.getState());
        }
        String json = GsonProtectorUtils.toJson(getGsonProvider(), searchInteractionModel, SearchInteractionModel.class);
        String str = this.LLIZLLLIL;
        if (str != null && C123100dR.LIZ(str)) {
            getStorage().LJIIIIZZ(json, str);
        }
    }

    public final void LIZ(C1A5S c1a5s) {
        int i;
        int i2;
        TuxIconView likeButton = getLikeButton();
        if (c1a5s == C1A5S.LIKE) {
            i = R.raw.icon_thumbs_up_fill;
        } else {
            i = R.raw.icon_thumbs_up;
        }
        likeButton.setIconRes(i);
        TuxIconView dislikeButton = getDislikeButton();
        if (c1a5s == C1A5S.DISLIKE) {
            i2 = R.raw.icon_thumbs_down_fill;
        } else {
            i2 = R.raw.icon_thumbs_down;
        }
        dislikeButton.setIconRes(i2);
        this.LLIZ = c1a5s;
        setLikeStateToStorage(c1a5s);
    }

    public final void setIconViewSize(int i) {
        ViewGroup.LayoutParams layoutParams = getLikeButton().getLayoutParams();
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        getLikeButton().requestLayout();
        ViewGroup.LayoutParams layoutParams2 = getDislikeButton().getLayoutParams();
        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        getDislikeButton().requestLayout();
    }

    public final void setNeedCache(boolean z) {
        this.LLJ = z;
    }

    public final void setOnClickDislikeCallback(Function1<? super C1A5S, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setOnClickLikeCallback(Function1<? super C1A5S, Unit> function1) {
        this.LLJI = function1;
    }

    public final void setRadius(int i) {
        this.LLILLL = i;
        getLikeButton().setBackground(getButtonBackground());
        getDislikeButton().setBackground(getButtonBackground());
        C427690Gpr.LJ(getLikeButton(), C418440Gaw.LIZIZ(Integer.valueOf(i)));
        C427690Gpr.LJ(getDislikeButton(), C418440Gaw.LIZIZ(Integer.valueOf(i)));
    }

    public final void setUniqueKeyForCache(String str) {
        this.LLIZLLLIL = str;
    }

    public C1A5Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(780));
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1410));
        this.LLILLL = 8;
        this.LLILZ = C452501pT.LIZIZ(new AwS434S0200000_33(context, this, 171));
        this.LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4184));
        this.LLILZLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4183));
        this.LLIZ = C1A5S.DEFAULT;
        this.LLJ = true;
        getLikeButton().setBackground(getButtonBackground());
        getDislikeButton().setBackground(getButtonBackground());
        C427690Gpr.LJ(getLikeButton(), C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
        C427690Gpr.LJ(getDislikeButton(), C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
        C786410Ut5.I7(new AjS73S0100000_33(this, 12), getLikeButton());
        C786410Ut5.I7(new AjS73S0100000_33(this, 13), getDislikeButton());
    }
}
