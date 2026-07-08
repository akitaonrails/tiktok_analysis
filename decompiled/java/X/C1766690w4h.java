package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.bean.OrderCenterGuideData;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import g1c.AjS3S1200000_26;
import g1c.AjS70S0100000_26;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766690w4h extends LinearLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public TuxIconView LLILZ;
    public SmartImageView LLILZIL;
    public TuxSheet LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public Map<String, ? extends Object> LLJ;

    public final C197039127h getOrderCenterGuideDialogButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pqw);
            this.LLILLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxTextView getOrderCenterGuideDialogDescriptionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pqx);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getOrderCenterGuideDialogImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pqy);
            this.LLILZIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getOrderCenterGuideDialogTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pr0);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getXMarkCloseButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x_mark_close_button);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, ? extends Object> map = this.LLJ;
        int i = 0;
        if (map != null) {
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("actionsheet_name", "order_center_shoptab_diversion_guide"));
            mapLJIIJ.putAll(map);
            C1018703yb.LIZIZ("tiktokec_enter_actionsheet", mapLJIIJ);
        }
        Map<String, ? extends Object> map2 = this.LLJ;
        if (map2 != null) {
            Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("entrance_name", "order_center_shoptab_diversion_guide"));
            mapLJIIJ2.putAll(map2);
            C1018703yb.LIZIZ("tiktokec_entrance_show", mapLJIIJ2);
        }
        Map<String, ? extends Object> map3 = this.LLJ;
        Object obj = map3 != null ? map3.get("page_name") : null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, "personal_home_page")) {
            i = 1;
        } else if (Intrinsics.LJFF(obj, "order_center")) {
            i = 2;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C317890Cd9(i, null), 3);
    }

    public final String getQuitType() {
        return this.LLIZLLLIL;
    }

    public final Map<String, Object> getTrackParams() {
        return this.LLJ;
    }

    public C1766690w4h(Context context) {
        super(context, null, 0);
        this.LLIZLLLIL = "return";
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bsq, this, true);
        setOrientation(1);
        setGravity(17);
        C1440005kM.LIZ(new IEvent() { // from class: X.0ij8
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public final void setImageLoaded(boolean z) {
        this.LLIZ = z;
    }

    public final void setOrderCenterGuideDialogButtonFromXml(C197039127h c197039127h) {
        this.LLILLL = c197039127h;
    }

    public final void setOrderCenterGuideDialogDescriptionFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setOrderCenterGuideDialogImageFromXml(SmartImageView smartImageView) {
        this.LLILZIL = smartImageView;
    }

    public final void setOrderCenterGuideDialogTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setQuitType(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setTrackParams(Map<String, ? extends Object> map) {
        this.LLJ = map;
    }

    public final void setTuxSheet(TuxSheet tuxSheet) {
        this.LLILZLL = tuxSheet;
    }

    public final void setXMarkCloseButtonFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void LIZ(OrderCenterGuideData orderCenterGuideData, Map<String, ? extends Object> map) {
        String str;
        this.LLJ = map;
        getOrderCenterGuideDialogTitleFromXml().LJJJJI(28.0f);
        getOrderCenterGuideDialogTitleFromXml().setText(orderCenterGuideData.title);
        getOrderCenterGuideDialogDescriptionFromXml().setText(orderCenterGuideData.description);
        getOrderCenterGuideDialogButtonFromXml().setText(orderCenterGuideData.buttonText);
        C1378990lzN.LIZIZ(getOrderCenterGuideDialogButtonFromXml(), Float.valueOf(C339190DRl.LIZ(8)), null, null, null, null, 30);
        C786410Ut5.I7(new AjS3S1200000_26(this, orderCenterGuideData.buttonJumpSchema, map, 1), getOrderCenterGuideDialogButtonFromXml());
        C786410Ut5.I7(new AjS70S0100000_26(this, 98), getXMarkCloseButtonFromXml());
        if (!C960203pA.LIZIZ(getContext()) ? (str = orderCenterGuideData.imageUrl) == null : (str = orderCenterGuideData.imageUrlDark) == null) {
            str = "";
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        c1331670kl3LIZLLL.LJJ(getOrderCenterGuideDialogImageFromXml());
        c1331670kl3LIZLLL.LJIIJ(new C1775620wJ6(this, 2));
    }
}
