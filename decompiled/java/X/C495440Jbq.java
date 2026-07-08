package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0Jbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495440Jbq extends AbstractC202143147p<IHostSubscription.Params, IHostSubscription.Result> {
    public IHostSubscription.Params LLIZ;
    public boolean LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;

    @Override // X.AbstractC1835360xrS
    public final void LJIIIZ() {
    }

    public C495440Jbq(SparkContext sparkContext) {
        super(sparkContext);
        this.LLJ = 121;
        this.LLJI = 122;
    }

    @Override // X.AbstractC1835360xrS
    public final void LJII(Object obj, C2204771BQt c2204771BQt) {
        int i;
        IHostSubscription.Params params = (IHostSubscription.Params) obj;
        this.LLIZ = params;
        this.LLIZLLLIL = params.async;
        IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        Fragment fragment = this.LLILZLL;
        if (fragment != null) {
            int i2 = this.LLJ;
            int i3 = this.LLJI;
            IHostSubscription.Params params2 = this.LLIZ;
            if (params2 != null) {
                i = params2.max_count;
            } else {
                i = 0;
            }
            iHostSubscription.tG2(fragment, i2, i3, i, params.emotesShowStyle, new C0L0G(params.min_width, params.min_height, params.max_width, params.max_height, params.max_size), params.logInfo, 100, 0);
        }
    }

    public final void LJIIJ(IHostSubscription.Result result, int i) {
        Fragment fragment;
        Context context;
        Resources resources;
        int i2;
        String quantityString;
        if (result.LIZ != 0 && (fragment = this.LLILZLL) != null && (context = fragment.getContext()) != null && (resources = context.getResources()) != null && (quantityString = resources.getQuantityString(2131755517, (i2 = result.LIZ), Integer.valueOf(i2))) != null) {
            C766270U4b.LJIIJJI(quantityString);
        }
        IHostSubscription.Result.PhotoFile[] photoFileArr = result.originFiles;
        if (photoFileArr != null) {
            if (i == 1) {
                if (result.LIZIZ > 0) {
                    C766270U4b.LIZLLL(2131841514);
                }
            } else if (photoFileArr.length > result.LIZ) {
                C766270U4b.LIZLLL(2131841514);
            }
        }
        try {
            LJI(result);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJFF();
        }
    }

    @Override // X.InterfaceC20023413We
    public final void onActivityResult(int i, int i2, Intent intent) {
        Fragment fragment;
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        IHostSubscription.Params params = this.LLIZ;
        int length = 0;
        if (params != null && (fragment = this.LLILZLL) != null && intent != null) {
            int i3 = params.emotesShowStyle;
            if (i3 != 1 && i3 != 2) {
                if (this.LLIZLLLIL) {
                    C500260Jjc.LJJJJJ(fragment, C0PEM.LIZJ, new C495400Jbm(iHostSubscription, fragment, intent, params, this, null), 2);
                } else {
                    IHostSubscription.Result resultVV1 = iHostSubscription.vV1(fragment, intent, params);
                    IHostSubscription.Result.PhotoFile[] photoFileArr = resultVV1.tempFiles;
                    if (photoFileArr != null) {
                        length = photoFileArr.length;
                    }
                    LJIIJ(resultVV1, params.emotesShowStyle);
                }
            } else {
                List<LiveSubMediaModel> listVZ = iHostSubscription.vZ(intent);
                int size = listVZ.size();
                if (this.LLIZLLLIL) {
                    C500260Jjc.LJJJJJ(fragment, C0PEM.LIZJ, new C495430Jbp(iHostSubscription, fragment, listVZ, params, this, null), 2);
                } else {
                    LJIIJ(iHostSubscription.T62(fragment, listVZ, params, false), params.emotesShowStyle);
                }
                length = size;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_jsb_chooseImage_for_sub");
        c474500IjALIZ.LJJII(Long.valueOf(SystemClock.currentThreadTimeMillis() - jCurrentThreadTimeMillis), "cost");
        c474500IjALIZ.LJJII(Integer.valueOf(length), "image_list_count");
        c474500IjALIZ.LIZ();
    }
}
