package X;

import Y.AObserverS224S0100000_21;
import Y.ARunnableS90S0200000_21;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.MissingFormatArgumentException;

/* JADX INFO: renamed from: X.0lDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349430lDh extends AbstractC21673619ry<C1348770lCd> {
    public final Fragment LL;
    public final C19EG LLILLJJLI;
    public final GiftViewModel LLILLL;
    public final String LLILZ;
    public final C1355450lNP LLILZIL;
    public GiftStruct[] LLILZLL = new GiftStruct[0];
    public long LLIZ = -1;
    public final LayoutInflater LLIZLLLIL;
    public final int LLJ;
    public int LLJI;
    public final boolean LLJIJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZLL.length;
    }

    public final void LLLFZ(long j) {
        int i;
        long j2 = this.LLIZ;
        this.LLIZ = j;
        if (this.LLJIJIL) {
            GiftStruct[] giftStructArr = this.LLILZLL;
            int length = giftStructArr.length;
            int i2 = 0;
            while (true) {
                i = -1;
                if (i2 < length) {
                    GiftStruct giftStruct = giftStructArr[i2];
                    if (giftStruct != null && giftStruct.id == j2) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            notifyItemChanged(i2);
            if (j != -1) {
                GiftStruct[] giftStructArr2 = this.LLILZLL;
                int length2 = giftStructArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        GiftStruct giftStruct2 = giftStructArr2[i3];
                        if (giftStruct2 != null && giftStruct2.id == j) {
                            i = i3;
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
                notifyItemChanged(i);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<String> urlList;
        String quantityString;
        String strLIZIZ;
        List<String> urlList2;
        String str;
        C1348770lCd c1348770lCd = (C1348770lCd) viewHolder;
        GiftStruct giftStruct = this.LLILZLL[i];
        long j = this.LLIZ;
        if (giftStruct != null) {
            c1348770lCd.LLJ = giftStruct;
            UrlModel urlModel = giftStruct.imageList;
            if (urlModel != null) {
                urlList = urlModel.getUrlList();
            } else {
                urlList = null;
            }
            if (urlList != null && !urlList.isEmpty()) {
                SmartImageView smartImageView = (SmartImageView) c1348770lCd.itemView.findViewById(R.id.iy9);
                UrlModel urlModel2 = giftStruct.imageList;
                if (urlModel2 != null && (urlList2 = urlModel2.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList2)) != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJ(smartImageView);
                    c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_INSIDE;
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                }
            }
            TextView textView = (TextView) c1348770lCd.LL.findViewById(R.id.iwf);
            try {
                Resources resources = c1348770lCd.LLILLL.getResources();
                int i2 = giftStruct.diamondCount;
                strLIZIZ = resources.getQuantityString(2131756061, i2, Integer.valueOf(i2));
            } catch (MissingFormatArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                if (giftStruct.diamondCount <= 1) {
                    quantityString = c1348770lCd.LLILLL.getResources().getQuantityString(2131756058, 1, 1);
                } else {
                    quantityString = c1348770lCd.LLILLL.getResources().getQuantityString(2131756058, 2, 2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(giftStruct.diamondCount);
                sbLIZ.append(' ');
                sbLIZ.append(quantityString);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            textView.setText(strLIZIZ);
            TuxTextView tuxTextView = (TuxTextView) c1348770lCd.LL.findViewById(R.id.iyo);
            tuxTextView.setMinTextSize(10.0f);
            tuxTextView.setText(giftStruct.name);
            if (giftStruct.id == j) {
                c1348770lCd.LL.setBackgroundResource(R.drawable.af6);
            } else {
                c1348770lCd.LL.setBackground(null);
                if (c1348770lCd.LLILZLL == 3 && !c1348770lCd.LLILZIL.LLJJ) {
                    HandlerHook.viewPostDelay(c1348770lCd.itemView, new ARunnableS90S0200000_21(giftStruct, c1348770lCd, 36), 700L);
                }
            }
            c1348770lCd.LLJI = j;
            C786410Ut5.LJLLLLLL(0, c1348770lCd.LL);
            c1348770lCd.LLJIJIL = i;
        } else {
            C786410Ut5.LJLLLLLL(4, c1348770lCd.LL);
        }
        ((LiveData) this.LLILLL.LLILZIL.getValue()).setValue(Boolean.TRUE);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1348770lCd c1348770lCd = new C1348770lCd(C786410Ut5.Td(this.LLIZLLLIL, R.layout.a2m, null, false), this.LL, this.LLILLJJLI, this.LLILZ, this.LLILLL, this.LLJI, this.LLILZIL);
        C786410Ut5.W5(c1348770lCd.itemView, new C19ME((C418440Gaw.LIZLLL(this.LLILLJJLI) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) / 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))));
        try {
            View view = c1348770lCd.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1348770lCd.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1348770lCd.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1348770lCd.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1348770lCd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1348770lCd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1348770lCd.class.getName();
        return c1348770lCd;
    }

    public C1349430lDh(Fragment fragment, C19EG c19eg, GiftViewModel giftViewModel, String str, C1355450lNP c1355450lNP) {
        int i;
        this.LL = fragment;
        this.LLILLJJLI = c19eg;
        this.LLILLL = giftViewModel;
        this.LLILZ = str;
        this.LLILZIL = c1355450lNP;
        this.LLIZLLLIL = C786410Ut5.ne(C1354730lMF.LIZIZ(c19eg));
        if (C290520Ba6.LIZ()) {
            i = 12;
        } else {
            i = 8;
        }
        this.LLJ = i;
        this.LLJIJIL = true;
        giftViewModel.wQ2().observe(this.LLILLJJLI, new AObserverS224S0100000_21(this, 58));
    }
}
