package X;

import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.aweme.im.sticker.api.socialavatar.SocialAvatarSettingsConfig;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarImageAssetCDNConfigSettings;
import com.zhiliaoapp.musically.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C455920HuI extends C912740ZrM {
    public final CardView LLIZ;
    public final C456160Hug LLIZLLLIL;
    public final C455320HtK LLJ;
    public int LLJI;
    public final IIMSocialAvatarService LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public final C01GW LLJILJILJ;
    public RecyclerView LLJILLL;

    private final User getUser() {
        return (User) this.LLJILJILJ.getValue();
    }

    public final C456040HuU LJ() {
        final ViewFlipper viewFlipper = (ViewFlipper) this.LLIZ.findViewById(R.id.sts);
        final RecyclerView recyclerView = (RecyclerView) viewFlipper.findViewById(R.id.aun);
        C455940HuK c455940HuK = new C455940HuK();
        c455940HuK.LIZ = this.LLJIJIL.LJJJJZ() == 0 ? EnumC455960HuM.LEFT : EnumC455960HuM.RIGHT;
        c455940HuK.LIZIZ = new SpannableString("😍");
        SpannableString spannableStringValueOf = SpannableString.valueOf(getContext().getString(2131827091));
        C786410Ut5.p2(spannableStringValueOf, new C444920HcY(62, false), 0, spannableStringValueOf.length(), 33);
        c455940HuK.LIZJ = spannableStringValueOf;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(30));
        c455940HuK.LIZLLL = c384050F3z.LIZ(getContext());
        c455940HuK.LJ = C800330VaR.LIZIZ(getContext(), R.drawable.cbw);
        c455940HuK.LJFF = new InterfaceC456070HuX() { // from class: X.0HuJ
            @Override // X.InterfaceC456070HuX
            public final void LIZ(EnumC455960HuM enumC455960HuM) {
                LIZJ(enumC455960HuM);
            }

            @Override // X.InterfaceC456070HuX
            public final void LIZIZ(EnumC455960HuM enumC455960HuM) {
                LIZJ(enumC455960HuM);
            }

            public final void LIZJ(EnumC455960HuM enumC455960HuM) {
                int i = C455950HuL.LIZ[enumC455960HuM.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.LIZ.LJII(recyclerView, viewFlipper);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C455920HuI c455920HuI = this.LIZ;
                    AnonymousClass0956 anonymousClass0956 = c455920HuI.LLJILJIL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    c455920HuI.LLJILJIL = null;
                    this.LIZ.LLJIJIL.LJJJJJ(0);
                    viewFlipper.setDisplayedChild(0);
                    this.LIZ.LJI(0);
                }
                C455920HuI c455920HuI2 = this.LIZ;
                c455920HuI2.LLJIJIL.LJJIJIL(c455920HuI2.getContext(), null, "message_reaction");
            }
        };
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        return new C456040HuU(c455940HuK.LIZ, c455940HuK.LIZIZ, c455940HuK.LIZJ, c455940HuK.LIZLLL, c455940HuK.LJ, c455940HuK.LJFF, new C456080HuY(iIntValue, numLIZJ2 != null ? numLIZJ2.intValue() : 0));
    }

    public final CardView getReactionSelectionPanel() {
        return this.LLIZ;
    }

    public final void LJI(int i) {
        List<String> listLLLI;
        InterfaceC912720ZrK popupCallback = getPopupCallback();
        if (popupCallback != null) {
            int i2 = this.LLJI;
            ArrayList arrayList = null;
            if (i == 0) {
                listLLLI = C456160Hug.LLLI();
            } else {
                listLLLI = null;
                List<StickerItem> list = this.LLJ.LLILLJJLI;
                arrayList = new ArrayList();
                Iterator<StickerItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    String strLIZ = C453560HqU.LIZ(it2.next());
                    if (strLIZ != null) {
                        arrayList.add(strLIZ);
                    }
                }
            }
            popupCallback.LIZLLL(i2, i, listLLLI, arrayList);
        }
    }

    public final void setupReactionsBeforeShow(LongPressConfig.ReactionConfig reactionConfig) {
        Animation inAnimation;
        Animation outAnimation;
        boolean z = reactionConfig.showAimojiPanel;
        C456050HuV c456050HuV = (C456050HuV) this.LLIZ.findViewById(R.id.str);
        ViewFlipper viewFlipper = (ViewFlipper) this.LLIZ.findViewById(R.id.sts);
        if (viewFlipper != null) {
            inAnimation = viewFlipper.getInAnimation();
            outAnimation = viewFlipper.getOutAnimation();
            viewFlipper.setInAnimation(null);
            viewFlipper.setOutAnimation(null);
        } else {
            inAnimation = null;
            outAnimation = null;
        }
        if (c456050HuV != null && z) {
            int visibility = c456050HuV.getVisibility();
            c456050HuV.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c456050HuV);
            this.LLJI = this.LLJIJIL.LJJJJZ();
            int iLJJJJZ = this.LLJIJIL.LJJJJZ();
            if (iLJJJJZ == 0) {
                AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLJILJIL = null;
                c456050HuV.LIZIZ(EnumC455960HuM.LEFT);
            } else {
                if (viewFlipper != null) {
                    viewFlipper.setDisplayedChild(iLJJJJZ);
                }
                RecyclerView recyclerView = (RecyclerView) this.LLIZ.findViewById(R.id.aun);
                if (recyclerView != null) {
                    LJII(recyclerView, viewFlipper);
                }
            }
        } else {
            this.LLJI = 0;
            if (c456050HuV != null) {
                int visibility2 = c456050HuV.getVisibility();
                c456050HuV.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c456050HuV);
            }
            this.LLJIJIL.LJJJJJ(0);
            if (viewFlipper != null) {
                viewFlipper.setDisplayedChild(0);
            }
            LJI(0);
        }
        if (viewFlipper != null) {
            viewFlipper.setInAnimation(inAnimation);
            viewFlipper.setOutAnimation(outAnimation);
        }
        C456160Hug c456160Hug = this.LLIZLLLIL;
        c456160Hug.LL = reactionConfig.selectedEmojis;
        InterfaceC455400HtS interfaceC455400HtS = reactionConfig.reactionSelectedListener;
        if (interfaceC455400HtS != null) {
            c456160Hug.LLILLL = interfaceC455400HtS;
        }
        c456160Hug.LLLIIIIL(true);
        RecyclerView recyclerView2 = this.LLJILLL;
        if (recyclerView2 != null) {
            HandlerHook.viewPost(recyclerView2, new ARunnableS106S0100000_6((Object) recyclerView2, 222));
        }
        C455320HtK c455320HtK = this.LLJ;
        c455320HtK.LL = reactionConfig.selectedAimojis;
        InterfaceC455400HtS interfaceC455400HtS2 = reactionConfig.reactionSelectedListener;
        if (interfaceC455400HtS2 != null) {
            c455320HtK.LLILLL = interfaceC455400HtS2;
        }
        c455320HtK.LLLI();
    }

    public C455920HuI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJII(RecyclerView recyclerView, ViewFlipper viewFlipper) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ == null) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            C1DFH c1dfh = C0PEM.LIZ;
            this.LLJILJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C455910HuH(this, recyclerView, viewFlipper, c19egLIZIZ, null), 3);
        }
    }

    public C455920HuI(Context context, AttributeSet attributeSet, int i) {
        SocialAvatarFeature socialAvatarFeatureLIZ;
        SocialAvatarFeature socialAvatarFeatureLIZ2;
        boolean z;
        int iIntValue;
        GradientDrawable.Orientation orientation;
        GradientDrawable.Orientation orientation2;
        View viewLJLLLL;
        String strLIZ;
        String str;
        int iIntValue2;
        String str2;
        super(context, attributeSet, i);
        CardView cardView = (CardView) findViewById(R.id.nql);
        this.LLIZ = cardView;
        C13BV c13bv = C13BV.INSTANCE;
        C456160Hug c456160Hug = new C456160Hug(c13bv, 44.0d, new InterfaceC455400HtS() { // from class: X.0HuN
            @Override // X.InterfaceC455400HtS
            public final void LIZ(InterfaceC879330YeZ interfaceC879330YeZ) {
            }
        });
        this.LLIZLLLIL = c456160Hug;
        C455320HtK c455320HtK = new C455320HtK(c13bv, c13bv);
        this.LLJ = c455320HtK;
        IIMSocialAvatarService imSocialAvatarService = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService();
        this.LLJIJIL = imSocialAvatarService;
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(495));
        C06QS c06qs = SocialAvatarFeature.LIZ;
        SocialAvatarFeature socialAvatarFeatureLIZ3 = c06qs.LIZ();
        if ((socialAvatarFeatureLIZ3 != null && socialAvatarFeatureLIZ3.LJ()) || (((socialAvatarFeatureLIZ = c06qs.LIZ()) != null && socialAvatarFeatureLIZ.LJII(getUser())) || ((socialAvatarFeatureLIZ2 = c06qs.LIZ()) != null && socialAvatarFeatureLIZ2.LJIIL(getUser())))) {
            z = true;
        } else {
            z = false;
        }
        ViewStub viewStub = (ViewStub) findViewById(R.id.dee);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        if (C426750GoL.LIZLLL(getContext())) {
            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{iIntValue, 0});
        if (C426750GoL.LIZLLL(getContext())) {
            orientation2 = GradientDrawable.Orientation.LEFT_RIGHT;
        } else {
            orientation2 = GradientDrawable.Orientation.RIGHT_LEFT;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation2, new int[]{iIntValue, 0});
        if (imSocialAvatarService.isEnabled() && z) {
            viewStub.setLayoutResource(R.layout.cqz);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            viewLJLLLL.findViewById(R.id.sto).setBackgroundDrawable(gradientDrawable);
            viewLJLLLL.findViewById(R.id.stq).setBackgroundDrawable(gradientDrawable2);
            C456050HuV c456050HuV = (C456050HuV) viewLJLLLL.findViewById(R.id.str);
            SmartImageView smartImageView = (SmartImageView) viewLJLLLL.findViewById(R.id.aui);
            if (C435330H5f.LIZ()) {
                ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(104));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    C786410Ut5.W5(smartImageView, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            SocialAvatarSettingsConfig socialAvatarSettingsConfigLJJJ = imSocialAvatarService.LJJJ();
            Context context2 = getContext();
            socialAvatarSettingsConfigLJJJ.getClass();
            if (C435330H5f.LIZ()) {
                DecimalFormat decimalFormat = SocialAvatarImageAssetCDNConfigSettings.LIZ;
                if (C960203pA.LIZIZ(context2)) {
                    str2 = "social_avatar_reaction_dark";
                } else {
                    str2 = "social_avatar_reaction_light";
                }
                strLIZ = SocialAvatarImageAssetCDNConfigSettings.LIZ(str2);
                if (strLIZ == null) {
                    strLIZ = "";
                }
            } else if (C960203pA.LIZIZ(context2) && (str = socialAvatarSettingsConfigLJJJ.createYoursImageDarkUrl) != null && str.length() != 0) {
                strLIZ = socialAvatarSettingsConfigLJJJ.createYoursImageDarkUrl;
            } else {
                strLIZ = socialAvatarSettingsConfigLJJJ.createYoursImageUrl;
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZ);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            TuxTextView tuxTextView = (TuxTextView) cardView.findViewById(R.id.aue);
            SocialAvatarFeature socialAvatarFeatureLIZ4 = c06qs.LIZ();
            if (socialAvatarFeatureLIZ4 != null) {
                tuxTextView.setText(socialAvatarFeatureLIZ4.LJIIJJI(getUser(), 2131827062));
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            tuxTextView.setTextColor(iIntValue2);
            tuxTextView.setTuxFont(102);
            if (c456050HuV.isLaidOut() && !c456050HuV.isLayoutRequested()) {
                c456050HuV.LIZ(LJ());
            } else {
                c456050HuV.addOnLayoutChangeListener(new C0IDO(c456050HuV, this, 3));
            }
            RecyclerView recyclerView = (RecyclerView) viewLJLLLL.findViewById(R.id.h0f);
            recyclerView.setAdapter(c456160Hug);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
            linearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setItemAnimator(null);
            recyclerView.addItemDecoration(new C0DX8());
            RecyclerView recyclerView2 = (RecyclerView) viewLJLLLL.findViewById(R.id.aun);
            recyclerView2.setAdapter(c455320HtK);
            recyclerView2.setItemAnimator(null);
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(recyclerView2.getContext());
            linearLayoutManager2.setOrientation(0);
            recyclerView2.setLayoutManager(linearLayoutManager2);
            this.LLJILLL = recyclerView2;
        } else {
            viewStub.setLayoutResource(R.layout.cr0);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            ViewGroup.LayoutParams layoutParams2 = viewLJLLLL.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                C786410Ut5.W5(viewLJLLLL, layoutParams2);
                viewLJLLLL.findViewById(R.id.sto).setBackgroundDrawable(gradientDrawable);
                viewLJLLLL.findViewById(R.id.stq).setBackgroundDrawable(gradientDrawable2);
                View viewFindViewById = viewLJLLLL.findViewById(R.id.h0f);
                if (viewFindViewById != null) {
                    ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
                    if (layoutParams3 != null) {
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
                        }
                        C786410Ut5.W5(viewFindViewById, layoutParams3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                RecyclerView recyclerView3 = (RecyclerView) viewLJLLLL.findViewById(R.id.h0f);
                recyclerView3.setAdapter(c456160Hug);
                LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(recyclerView3.getContext());
                linearLayoutManager3.setOrientation(0);
                recyclerView3.setLayoutManager(linearLayoutManager3);
                recyclerView3.addItemDecoration(new C0DX8());
                this.LLJILLL = recyclerView3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        viewLJLLLL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iMin = Math.min(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(340)), C497820Jfg.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) * 2));
        CardView cardView2 = this.LLIZ;
        ViewGroup.LayoutParams layoutParams4 = cardView2.getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.width = iMin;
            C786410Ut5.W5(cardView2, layoutParams4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void LJFF(IMSocialAvatarStatus iMSocialAvatarStatus, RecyclerView recyclerView, ViewFlipper viewFlipper, C19EG c19eg) {
        List<StickerItem> stickers;
        C455320HtK c455320HtK;
        boolean z = iMSocialAvatarStatus instanceof C0HK0;
        String strLJI = null;
        if (iMSocialAvatarStatus instanceof C0HK1) {
            stickers = ((C0HK1) iMSocialAvatarStatus).getStickers();
        } else {
            stickers = null;
        }
        if (z) {
            IIMSocialAvatarService imSocialAvatarService = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService();
            if (stickers == null) {
                stickers = C13BV.INSTANCE;
            }
            List<StickerItem> listLJIIJ = imSocialAvatarService.LJIIJ(stickers, EnumC454380Hro.STICKER_REACTION);
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if ((adapter instanceof C455320HtK) && (c455320HtK = (C455320HtK) adapter) != null) {
                c455320HtK.LLILLJJLI = listLJIIJ;
                c455320HtK.LLLI();
            }
            final boolean zLIZJ = C444960Hcc.LIZJ(recyclerView.getContext());
            while (recyclerView.getItemDecorationCount() > 0) {
                recyclerView.removeItemDecorationAt(0);
            }
            final int size = listLJIIJ.size();
            recyclerView.addItemDecoration(new C0DXR(size, zLIZJ) { // from class: X.0Dck
                public final int LL;
                public final boolean LLILLJJLI;
                public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));

                {
                    this.LL = size;
                    this.LLILLJJLI = zLIZJ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    if (this.LLILLJJLI) {
                        if (recyclerView2.getChildLayoutPosition(view) == this.LL - 1) {
                            int i = this.LLILLL;
                            rect.right = i;
                            rect.left = i;
                            return;
                        }
                        rect.right = this.LLILLL;
                        return;
                    }
                    if (recyclerView2.getChildLayoutPosition(view) == this.LL - 1) {
                        int i2 = this.LLILLL;
                        rect.left = i2;
                        rect.right = i2;
                        return;
                    }
                    rect.left = this.LLILLL;
                }
            });
            if (viewFlipper.getDisplayedChild() != 2) {
                viewFlipper.setDisplayedChild(2);
                LJI(2);
                SocialAvatarFeature socialAvatarFeatureLIZ = SocialAvatarFeature.LIZ.LIZ();
                if (socialAvatarFeatureLIZ != null) {
                    socialAvatarFeatureLIZ.LJIIJ(c19eg);
                }
            }
            this.LLJIJIL.LJJJJJ(2);
            return;
        }
        if (viewFlipper.getDisplayedChild() != 1) {
            TextView textView = (TextView) this.LLIZ.findViewById(R.id.aue);
            C06QS c06qs = SocialAvatarFeature.LIZ;
            SocialAvatarFeature socialAvatarFeatureLIZ2 = c06qs.LIZ();
            if (socialAvatarFeatureLIZ2 != null) {
                textView.setText(socialAvatarFeatureLIZ2.LJIIJJI(getUser(), 2131827062));
            }
            SocialAvatarFeature socialAvatarFeatureLIZ3 = c06qs.LIZ();
            if (socialAvatarFeatureLIZ3 != null) {
                User user = getUser();
                if (user != null) {
                    strLJI = user.getUid();
                }
                strLJI = socialAvatarFeatureLIZ3.LJI(strLJI);
            }
            C0HYM.LJ("long_press", "chat", strLJI, 8);
            viewFlipper.setDisplayedChild(1);
            LJI(1);
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 124), viewFlipper.findViewById(R.id.auh));
            this.LLJIJIL.LJJJJJ(1);
        }
    }
}
