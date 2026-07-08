package X;

import Y.ACListenerS153S0100000_18;
import android.content.DialogInterface;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.CollectionIntroBehavior;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.TuxCollectionIntroBehavior;
import com.ss.android.ugc.aweme.favorites.experiment.CollaborativeCollectionConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@InterfaceC20647615qs("collaborative_collection_guide")
public final class C1171980gbU extends AbstractC20660015ss<DialogFragment> {
    public static final /* synthetic */ int LLIZ = 0;
    public final C19EG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 8005;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return C1171890gbL.LIZ();
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        final C1171530gal c1171530gal = new C1171530gal(this.LLILLJJLI, false, false, true, this.LLILLL, false, 44);
        final C19EG c19eg = this.LL;
        FrameLayout frameLayout = new FrameLayout(c19eg) { // from class: X.0gbX
            {
                super(c19eg, null, 0);
                FrameLayout.inflate(c19eg, R.layout.c6g, this);
                ImageView imageView = (ImageView) findViewById(R.id.kxh);
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.s5;
                imageView.setImageDrawable(c0hti.LIZ(getContext()));
                CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ = C1171750gb7.LIZJ();
                if (collaborativeCollectionConfigLIZJ != null && collaborativeCollectionConfigLIZJ.writingType == 1) {
                    ((TextView) findViewById(R.id.t6x)).setText(getContext().getString(2131847935));
                }
                C786410Ut5.a9((TuxIconView) findViewById(R.id.kx5), new ACListenerS153S0100000_18(this, 25));
                C786410Ut5.U8((C197039127h) findViewById(R.id.pc_), new ACListenerS153S0100000_18(this, 26));
                C786410Ut5.U8((C197039127h) findViewById(R.id.ylg), new ACListenerS153S0100000_18(this, 27));
                ((TuxTextView) findViewById(R.id.ky9)).setTypeface(C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 28.0f, 0.0f, Float.valueOf(28.0f), 0.0f, 0, null, 224));
            }
        };
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLJJIII = frameLayout;
        tuxSheet.LLJLILLLLZIIL = false;
        if (C299110Bnx.LIZ()) {
            c1390920mIc.LIZ.LLLIIIIL = new TuxCollectionIntroBehavior();
        } else {
            c1390920mIc.LIZ.LLLIIII = new CollectionIntroBehavior();
        }
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0gbT
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String str = TuxSheet._pnsPageId;
                if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C1172000gbW) {
                    C1171530gal.LJI(c1171530gal, this.LL, null, 4);
                    return;
                }
                if (C1171990gbV.LIZ()) {
                    C1171980gbU c1171980gbU = this;
                    new C1171910gbN(c1171980gbU.LLILLJJLI, c1171980gbU.LLILZ, c1171980gbU.LLILLL, c1171980gbU.LLILZIL, c1171980gbU.LLILZLL).LIZJ(this.LL);
                    return;
                }
                c1171530gal.LJ(this.LL);
            }
        };
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = onDismissListener;
        tuxSheet2.show(this.LL.getSupportFragmentManager(), "collection_invite_intro");
        C1171870gbJ.LIZ.getClass();
        C1171870gbJ.LIZ().storeBoolean("collaborative_pop_up_", true);
        C1171860gbI c1171860gbI = C1171860gbI.LIZ;
        String str = this.LLILLL;
        c1171860gbI.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("popup_type", "create_co_collection_intro");
        C20684815ws.LJIILLIIL("ttsocial_co_collection_intro_popup_show", c2344009Gk.LIZ);
        return tuxSheet2;
    }

    public C1171980gbU(C19EG c19eg, String str, String str2, String str3, boolean z, boolean z2) {
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = z2;
    }
}
