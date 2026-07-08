package com.bytedance.android.feed.api;

import X.C006A;
import X.C0IV7;
import X.C11JN;
import X.C19EG;
import X.C467450IUt;
import X.C468110IXh;
import X.C469370Iat;
import X.C469420Iay;
import X.C469770IbX;
import X.C471300Ie0;
import X.C472700IgG;
import X.C473300IhE;
import X.C477010InD;
import X.C477190InV;
import X.C477740IoO;
import X.C486690J6t;
import X.EnumC469490Ib5;
import X.EnumC471790Ien;
import X.EnumC477350Inl;
import X.InterfaceC469760IbW;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchResultFragment;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;
import java.util.Map;
import webcast.api.room.PackageInfo;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyInfo;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveFeedApiService extends C006A {
    List<Integer> BY1(String str);

    void Cz1(C19EG c19eg, String str);

    Boolean Eo();

    void H12();

    void I9();

    C11JN IC(String str, String str2, String str3, Map map);

    void Jn0(StrategyData strategyData);

    void Js0();

    String Km0();

    Map<String, Object> L7(long j);

    void OY(String str, StrategyData strategyData);

    void P4();

    void PJ0();

    C477190InV TI(C477010InD c477010InD, EnumC477350Inl enumC477350Inl, EnumC471790Ien enumC471790Ien, LifecycleOwner lifecycleOwner);

    C468110IXh U91();

    LiveSearchResultFragment WM(C469370Iat c469370Iat, C469420Iay c469420Iay);

    void Ww0();

    void Xm(List<ItemTab> list);

    Fragment YU(InterfaceC469760IbW interfaceC469760IbW, C469770IbX c469770IbX, EnumC469490Ib5 enumC469490Ib5);

    boolean Ze1(Map map);

    void Zg();

    void aw2();

    void ef();

    String i0();

    boolean mI0();

    C472700IgG mL1(C477740IoO c477740IoO, EnumC477350Inl enumC477350Inl);

    C467450IUt mk();

    EnterRoomConfig nY(int i, List<FeedItem> list, FeedExtra feedExtra);

    void np2();

    C471300Ie0 ot();

    void p22(List<StrategyInfo> list, List<PackageInfo> list2);

    C0IV7 tv0();

    C486690J6t ut();

    Map<String, Object> ux(long j);

    void v3();

    C473300IhE y30(int i, boolean z);

    void zX1();

    void zr();
}
