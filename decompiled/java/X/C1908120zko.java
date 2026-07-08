package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0zko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908120zko extends LinearLayout {
    public TuxTextView LL;
    public RemoteImageView LLILLJJLI;
    public MusicCollectionItem LLILLL;
    public InterfaceC1908130zkp LLILZ;

    public C1908120zko(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, 0);
        setOrientation(1);
        setClipChildren(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C1911780zqi.LIZ.getClass();
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "music_pick_page_type", true) == 2) {
            i = R.layout.cx7;
        } else {
            i = R.layout.cxg;
        }
        C786410Ut5.Td(C786410Ut5.ne(context), i, this, true);
        this.LL = (TuxTextView) findViewById(R.id.zdq);
        this.LLILLJJLI = (RemoteImageView) findViewById(R.id.lbu);
        View.OnClickListener aCListenerS162S0100000_28 = new ACListenerS162S0100000_28(this, 83);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS162S0100000_28) : aCListenerS162S0100000_28);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void LIZ(int i, InterfaceC1908130zkp interfaceC1908130zkp, MusicCollectionItem musicCollectionItem) {
        UrlModel urlModel;
        this.LLILLL = musicCollectionItem;
        if (musicCollectionItem == null) {
            return;
        }
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            String str = musicCollectionItem.mcName;
            if (str == null) {
                str = "";
            }
            tuxTextView.setText(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shooting_music_list_panel");
        sbLIZ.append("@@");
        sbLIZ.append("creation");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        RemoteImageView remoteImageView = this.LLILLJJLI;
        MusicCollectionItem musicCollectionItem2 = this.LLILLL;
        if (musicCollectionItem2 != null) {
            urlModel = musicCollectionItem2.awemeCover;
        } else {
            urlModel = null;
        }
        C1324840ka2.LJII(remoteImageView, urlModel, null, null, strLIZIZ);
        this.LLILZ = interfaceC1908130zkp;
    }
}
