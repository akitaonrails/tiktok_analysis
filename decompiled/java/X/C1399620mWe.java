package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399620mWe extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ PropReuseServiceImpl LLILLJJLI;
    public final /* synthetic */ ArrayList<NewFaceStickerBean> LLILLL;
    public final /* synthetic */ String LLILZ = "";
    public final /* synthetic */ Music LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Aweme LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ boolean LLJJI;
    public final /* synthetic */ boolean LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ ShootExtraData LLJJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399620mWe(Activity activity, PropReuseServiceImpl propReuseServiceImpl, ArrayList arrayList, Music music, String str, String str2, String str3, Integer num, int i, boolean z, String str4, Aweme aweme, String str5, String str6, String str7, boolean z2, boolean z3, String str8, String str9, ShootExtraData shootExtraData) {
        super(0);
        this.LL = activity;
        this.LLILLJJLI = propReuseServiceImpl;
        this.LLILLL = arrayList;
        this.LLILZIL = music;
        this.LLILZLL = str;
        this.LLIZ = str3;
        this.LLIZLLLIL = num;
        this.LLJ = i;
        this.LLJI = z;
        this.LLJIJIL = str4;
        this.LLJILJIL = aweme;
        this.LLJILJILJ = str5;
        this.LLJILLL = str6;
        this.LLJJ = str7;
        this.LLJJI = z2;
        this.LLJJIII = z3;
        this.LLJJIJI = str8;
        this.LLJJIJIIJIL = str9;
        this.LLJJIJIL = shootExtraData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL.isFinishing() && !this.LL.isDestroyed()) {
            PropReuseServiceImpl propReuseServiceImpl = this.LLILLJJLI;
            Activity activity = this.LL;
            ArrayList<NewFaceStickerBean> arrayList = this.LLILLL;
            String str = this.LLILZ;
            Music music = this.LLILZIL;
            String str2 = this.LLILZLL;
            String str3 = this.LLIZ;
            Integer num = this.LLIZLLLIL;
            int i = this.LLJ;
            boolean z = this.LLJI;
            String str4 = this.LLJIJIL;
            Aweme aweme = this.LLJILJIL;
            String str5 = this.LLJILJILJ;
            String str6 = this.LLJILLL;
            String str7 = this.LLJJ;
            boolean z2 = this.LLJJI;
            boolean z3 = this.LLJJIII;
            String str8 = this.LLJJIJI;
            String str9 = this.LLJJIJIIJIL;
            ShootExtraData shootExtraData = this.LLJJIJIL;
            propReuseServiceImpl.getClass();
            PropReuseServiceImpl.LJIILIIL(activity, arrayList, str, music, str2, str3, num, i, z, str4, aweme, str5, str6, str7, z2, z3, str8, str9, shootExtraData);
        }
        return Unit.LIZ;
    }
}
