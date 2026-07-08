package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard;
import com.zhiliaoapp.musically.R;
import g1c.AjS46S0200000_32;
import g1c.AjS72S0100000_32;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.182F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182F extends AbstractC212214182y {
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public GoLiveCard LLJ;
    public final C085L LLJI;

    @Override // X.AbstractC212214182y
    public final void e0() {
        C1548820qPI.LJIIIZ(this.LLJI, "seller_mission_card_update");
        C1548820qPI.LJIIIZ(this.LLJI, "seller_mission_card_finish_reward");
    }

    @Override // X.AbstractC212214182y
    public Map<String, String> getContentShowParams() {
        String str;
        HashMap map;
        try {
            GoLiveCard goLiveCard = this.LLJ;
            return (goLiveCard == null || (str = goLiveCard.daInfo) == null || (map = (HashMap) C08JS.LIZIZ().LJIIIIZZ(str, new TypeToken<HashMap<String, String>>() { // from class: X.182H
            }.getType())) == null) ? C2097608Jq.LJ() : map;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }

    public final TuxTextView getEcommerceliveGoLiveButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl3);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveGoLiveContentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl5);
            this.LLIZLLLIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getEcommerceliveGoLiveContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl4);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getEcommerceliveGoLiveTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl6);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl8);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void setEcommerceliveGoLiveButtonFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setEcommerceliveGoLiveContentContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLIZLLLIL = constraintLayout;
    }

    public final void setEcommerceliveGoLiveContentFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setEcommerceliveGoLiveTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setGoLiveCard(GoLiveCard goLiveCard) {
        TuxTextView ecommerceliveGoLiveButtonFromXml;
        this.LLJ = goLiveCard;
        TuxTextView ecommerceliveGoLiveTitleFromXml = getEcommerceliveGoLiveTitleFromXml();
        if (ecommerceliveGoLiveTitleFromXml != null) {
            ecommerceliveGoLiveTitleFromXml.setText(goLiveCard.title);
        }
        TuxTextView ecommerceliveGoLiveContentFromXml = getEcommerceliveGoLiveContentFromXml();
        if (ecommerceliveGoLiveContentFromXml != null) {
            ecommerceliveGoLiveContentFromXml.setText(goLiveCard.content);
        }
        TuxTextView ecommerceliveGoLiveContentFromXml2 = getEcommerceliveGoLiveContentFromXml();
        if (ecommerceliveGoLiveContentFromXml2 != null) {
            ecommerceliveGoLiveContentFromXml2.setMinTextSize(12.0f);
        }
        TuxTextView ecommerceliveGoLiveButtonFromXml2 = getEcommerceliveGoLiveButtonFromXml();
        if (ecommerceliveGoLiveButtonFromXml2 != null) {
            ecommerceliveGoLiveButtonFromXml2.setText(goLiveCard.buttonText);
        }
        ConstraintLayout ecommerceliveGoLiveContentContainerFromXml = getEcommerceliveGoLiveContentContainerFromXml();
        if (ecommerceliveGoLiveContentContainerFromXml != null) {
            C786410Ut5.I7(new AjS46S0200000_32(this, goLiveCard, 2), ecommerceliveGoLiveContentContainerFromXml);
        }
        if (C123100dR.LIZ(goLiveCard.btnSchema) && (ecommerceliveGoLiveButtonFromXml = getEcommerceliveGoLiveButtonFromXml()) != null) {
            C786410Ut5.I7(new AjS46S0200000_32(this, goLiveCard, 3), ecommerceliveGoLiveButtonFromXml);
        }
    }

    public C182F(Context context, AttributeSet attributeSet, int i) throws JSONException {
        super(context, attributeSet, i);
        C085L c085l = new C085L("SellerTaskPopup", System.currentTimeMillis(), new InterfaceC1548390qOb() { // from class: X.182G
            @Override // X.InterfaceC1548390qOb
            public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str) {
                TuxIconView ecommerceliveIconCloseFromXml;
                View.OnClickListener closeClickListener;
                if (Intrinsics.LJFF(str, "seller_mission_card_update")) {
                    C786410Ut5.LLLLZLL(this.LL.getEcommerceliveGoLiveButtonFromXml(), 8);
                } else {
                    if (!Intrinsics.LJFF(str, "seller_mission_card_finish_reward") || (ecommerceliveIconCloseFromXml = this.LL.getEcommerceliveIconCloseFromXml()) == null || (closeClickListener = this.LL.getCloseClickListener()) == null) {
                        return;
                    }
                    closeClickListener.onClick(ecommerceliveIconCloseFromXml);
                }
            }
        }, null);
        this.LLJI = c085l;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z5);
        C786410Ut5.Sd(R.layout.bvb, C786410Ut5.ne(contextThemeWrapper), this);
        setBackground(C800330VaR.LIZIZ(contextThemeWrapper, R.drawable.bmd));
        TuxIconView ecommerceliveIconCloseFromXml = getEcommerceliveIconCloseFromXml();
        if (ecommerceliveIconCloseFromXml != null) {
            C786410Ut5.I7(new AjS72S0100000_32(this, 6), ecommerceliveIconCloseFromXml);
        }
        C1548820qPI.LJI(c085l, "seller_mission_card_update");
        C1548820qPI.LJI(c085l, "seller_mission_card_finish_reward");
    }

    @Override // X.AbstractC212214182y
    public final void h0(C182T c182t, long j, GoLiveCard goLiveCard, Integer num) {
        if (goLiveCard != null) {
            setGoLiveCard(goLiveCard);
        }
    }
}
