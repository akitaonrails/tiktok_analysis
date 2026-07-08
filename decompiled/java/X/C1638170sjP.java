package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.AwS88S1300000_25;

/* JADX INFO: renamed from: X.0sjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1638170sjP extends AbstractC1637470siH<Effect> {
    public final AbstractC1291220jho LLILZLL;
    public final Function0<VideoPublishEditModel> LLIZ;
    public final LifecycleOwner LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;

    @Override // X.AbstractC1637470siH
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public void V2(Effect effect) {
        List<String> urlList;
        String str;
        List<String> urlList2;
        List<String> urlList3;
        if (C1635160seY.LIZJ(effect)) {
            float f = C1640600snK.LIZIZ / C1640600snK.LIZ;
            C1662850tND c1662850tND = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tND);
            c1662850tND.setScaleX(f);
            C1662850tND c1662850tND2 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tND2);
            c1662850tND2.setScaleY(f);
        } else {
            C1662850tND c1662850tND3 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tND3);
            c1662850tND3.setScaleX(1.0f);
            C1662850tND c1662850tND4 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tND4);
            c1662850tND4.setScaleY(1.0f);
        }
        if (C1635160seY.LIZ(effect)) {
            this.LL.getImageView().getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LIZJ);
        }
        if (C1641230soL.LIZIZ() && (C1462570oAB.LJIILIIL(effect) || C1462570oAB.LJIIJ(effect))) {
            C1662850tND c1662850tND5 = this.LL;
            C1320310kSj c1320310kSj = InterfaceC1320380kSq.LIZJ;
            c1662850tND5.setPlaceHolderScaleType(c1320310kSj);
            this.LL.setFailureImageScaleType(c1320310kSj);
            ((ViewGroup) this.itemView).setClipChildren(false);
            this.LL.setClipChildren(false);
            this.LL.getImageView().getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJFF);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJI);
        sbLIZ.append("@@");
        sbLIZ.append(this.LLJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C1641230soL.LIZIZ()) {
            UrlModel iconUrl = effect.getIconUrl();
            if (iconUrl != null) {
                urlList3 = iconUrl.getUrlList();
            } else {
                urlList3 = null;
            }
            if (!C1462570oAB.LJIILIIL(effect) && !C1462570oAB.LJIIJ(effect)) {
                C1324750kZt.LJIILJJIL(this.LL.getImageView(), urlList3, -1, -1, null, null, new C1636130sg7(effect), strLIZIZ);
            } else {
                this.itemView.setPadding(0, 0, 0, 0);
                if (!C1462570oAB.LJIIL(effect) && !C1462570oAB.LJIILJJIL(effect)) {
                    C1324750kZt.LJIILIIL(this.LL.getImageView(), urlList3, -1, -1, null, this.LLILZLL, null, new C1636130sg7(effect), strLIZIZ);
                } else {
                    C1656660tDE c1656660tDE = new C1656660tDE(this.itemView.getContext(), this.LLIZLLLIL);
                    c1656660tDE.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                    C1324750kZt.LJIILIIL(this.LL.getImageView(), urlList3, -1, -1, null, c1656660tDE, null, new C1636130sg7(effect), strLIZIZ);
                }
            }
            this.itemView.setContentDescription(effect.getName());
            return;
        }
        if (C0BN4.LIZ()) {
            UrlModel iconUrl2 = effect.getIconUrl();
            if (iconUrl2 != null) {
                urlList2 = iconUrl2.getUrlList();
            } else {
                urlList2 = null;
            }
            C1638230sjV c1638230sjV = C1638230sjV.LIZ;
            if (C1326470kcf.LIZJ()) {
                c1638230sjV.LJFF(effect, this.LL.getImageView(), this.LL.getImageView().getWidth(), this.LL.getImageView().getHeight(), Bitmap.Config.RGB_565, null, null, new AwS88S1300000_25(this, (C1638170sjP) urlList2, (List<String>) effect, (Effect) strLIZIZ, (String) 6));
            } else {
                C1324750kZt.LJIILJJIL(this.LL.getImageView(), urlList2, -1, -1, null, null, new C1636130sg7(effect), strLIZIZ);
            }
        } else {
            UrlModel iconUrl3 = effect.getIconUrl();
            if (iconUrl3 != null && (urlList = iconUrl3.getUrlList()) != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                C1638230sjV c1638230sjV2 = C1638230sjV.LIZ;
                if (C1326470kcf.LIZJ()) {
                    c1638230sjV2.LJFF(effect, this.LL.getImageView(), this.LL.getImageView().getWidth(), this.LL.getImageView().getHeight(), Bitmap.Config.RGB_565, null, new C1636130sg7(effect), new C1637730sih(this, str, effect, strLIZIZ));
                } else {
                    C1324750kZt.LJIIJJI(this.LL.getImageView(), str, -1, -1, null, null, new C1636130sg7(effect), strLIZIZ);
                }
            }
        }
        this.itemView.setContentDescription(effect.getName());
    }

    public /* synthetic */ C1638170sjP(View view, C1662850tND c1662850tND, AwS674S0100000_25 awS674S0100000_25, C1656660tDE c1656660tDE, Function0 function0, int i) {
        this(view, c1662850tND, awS674S0100000_25, (i & 8) != 0 ? null : c1656660tDE, (i & 16) != 0 ? null : function0, (LifecycleOwner) null);
    }

    public C1638170sjP(View view, C1662850tND c1662850tND, AwS674S0100000_25 awS674S0100000_25, AbstractC1291220jho abstractC1291220jho, Function0 function0, LifecycleOwner lifecycleOwner) {
        super(view, c1662850tND, awS674S0100000_25);
        this.LLILZLL = abstractC1291220jho;
        this.LLIZ = function0;
        this.LLIZLLLIL = lifecycleOwner;
        this.LLJ = "creation";
        this.LLJI = "sticker_list_panel";
    }
}
