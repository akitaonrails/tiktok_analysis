package X;

import Y.ACListenerS111S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.AudienceLastSelectDefinitionInfo;
import com.bytedance.android.livesdk.dataChannel.AudienceShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.GameLiveVideoQualityOptV2EnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.PersistGameManualDefinitionTypeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0INK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0INK extends AbstractC21673619ry<C0INI> {
    public final RecyclerView LL;
    public final List<C0INF> LLILLJJLI;
    public final boolean LLILLL;
    public final DataChannel LLILZ;
    public final C0INJ LLILZIL;
    public int LLILZLL;
    public final BPEAHandler LLIZ = new BPEAHandler(Looper.getMainLooper());
    public boolean LLIZLLLIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public final void LLLFZ(C0INI c0ini) {
        final int bindingAdapterPosition;
        final int i;
        String strLIZLLL;
        if (!this.LLIZLLLIL && (bindingAdapterPosition = c0ini.getBindingAdapterPosition()) != (i = this.LLILZLL)) {
            final String strLIZJ = C0INE.LIZJ();
            this.LLIZLLLIL = true;
            C0INF c0inf = (C0INF) ListProtector.get(this.LLILLJJLI, bindingAdapterPosition);
            if (c0inf.LIZLLL && GameLiveVideoQualityOptV2EnableSetting.INSTANCE.enable()) {
                strLIZLLL = C0INE.LIZLLL();
            } else {
                strLIZLLL = c0inf.LIZIZ;
            }
            final String str = ((C0INF) ListProtector.get(this.LLILLJJLI, i)).LIZIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
            if (str3 != null) {
                str2 = str3;
            }
            InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str2);
            if (interfaceC480510IsrLIZIZ != null) {
                interfaceC480510IsrLIZIZ.switchResolution(strLIZLLL, new InterfaceC1699420uKC() { // from class: X.0INH
                    @Override // X.InterfaceC1699420uKC
                    public final void LIZ(final boolean z) {
                        final C0INK c0ink = this.LIZ;
                        BPEAHandler bPEAHandler = c0ink.LLIZ;
                        final int i2 = bindingAdapterPosition;
                        final String str4 = strLIZJ;
                        final String str5 = str;
                        final int i3 = i;
                        C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0ING
                            public final void LIZ() {
                                Object objGg0;
                                String str6;
                                String str7;
                                String strValueOf;
                                Map map;
                                Map map2;
                                LiveMode liveMode;
                                if (z) {
                                    PushStreamInfo.Quality quality = new PushStreamInfo.Quality();
                                    quality.sdkKey = ((C0INF) ListProtector.get(c0ink.LLILLJJLI, i2)).LIZIZ;
                                    quality.name = ((C0INF) ListProtector.get(c0ink.LLILLJJLI, i2)).LIZ;
                                    String strLIZ = "";
                                    if (GameLiveVideoQualityOptV2EnableSetting.INSTANCE.enable()) {
                                        boolean z2 = ((C0INF) ListProtector.get(c0ink.LLILLJJLI, i2)).LIZLLL;
                                        String str8 = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        InterfaceC480510Isr interfaceC480510IsrLIZIZ2 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str8);
                                        if (interfaceC480510IsrLIZIZ2 != null) {
                                            interfaceC480510IsrLIZIZ2.w0(z2);
                                        }
                                    }
                                    DataChannel dataChannel = c0ink.LLILZ;
                                    if (dataChannel != null) {
                                        dataChannel.zW(AudienceShareScreenDefinition.class, quality);
                                    }
                                    boolean zLJI = C804420Vh2.LJI(C497740JfY.LJII());
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("name", quality.name);
                                    linkedHashMap.put("sdk_key", quality.sdkKey);
                                    PersistGameManualDefinitionTypeSetting persistGameManualDefinitionTypeSetting = PersistGameManualDefinitionTypeSetting.INSTANCE;
                                    if (persistGameManualDefinitionTypeSetting.isDiskCache()) {
                                        InterfaceC465660INw.Yc.LJFF(linkedHashMap);
                                    } else if (persistGameManualDefinitionTypeSetting.isMemoryCache()) {
                                        C0IN8.LIZ = linkedHashMap;
                                    }
                                    String str9 = str4;
                                    if (str9 != null && !Intrinsics.LJFF(str9, quality.sdkKey)) {
                                        if (zLJI) {
                                            c0ink.LLLI(quality, true);
                                        } else {
                                            c0ink.LLLI(quality, false);
                                        }
                                    }
                                    C0INK c0ink2 = c0ink;
                                    String str10 = quality.sdkKey;
                                    String str11 = str5;
                                    DataChannel dataChannel2 = c0ink2.LLILZ;
                                    if (dataChannel2 == null || (objGg0 = dataChannel2.gg0(C751340Tdc.class)) == null) {
                                        objGg0 = "";
                                    }
                                    String string = objGg0.toString();
                                    DataChannel dataChannel3 = c0ink2.LLILZ;
                                    if (dataChannel3 != null && (liveMode = (LiveMode) dataChannel3.gg0(LiveModeChannel.class)) != null) {
                                        strLIZ = C354201Zc.LIZ(liveMode);
                                    }
                                    boolean z3 = c0ink2.LLILLL;
                                    String strValueOf2 = CardStruct.IStatusCode.DEFAULT;
                                    if (z3) {
                                        str6 = CardStruct.IStatusCode.DEFAULT;
                                    } else {
                                        if (z3) {
                                            throw new C1954807lC();
                                        }
                                        str6 = "1";
                                    }
                                    DataChannel dataChannel4 = c0ink2.LLILZ;
                                    if (dataChannel4 == null || (map2 = (Map) dataChannel4.gg0(AudienceLastSelectDefinitionInfo.class)) == null || (str7 = (String) map2.get("sdk_key")) == null) {
                                        str7 = str11;
                                    }
                                    try {
                                        DataChannel dataChannel5 = c0ink2.LLILZ;
                                        if (dataChannel5 == null || (map = (Map) dataChannel5.gg0(AudienceLastSelectDefinitionInfo.class)) == null || (strValueOf = (String) map.get("start_time")) == null) {
                                            strValueOf = String.valueOf(System.currentTimeMillis());
                                        }
                                        strValueOf2 = String.valueOf((System.currentTimeMillis() - CastLongProtector.parseLong(strValueOf)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("reportSelectSuccess. catch exception=");
                                        sbLIZ.append(e);
                                        C20441214yg.LJIIIZ("LiveDefinitionSelectionDialog", C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                    C491701vn.LIZLLL(string, strLIZ, str6, strValueOf2, str7, "normal", str10);
                                    C0INK c0ink3 = c0ink;
                                    int i4 = i2;
                                    c0ink3.getClass();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("selectItemUI. position=");
                                    sbLIZ2.append(i4);
                                    C20441214yg.LJIIIZ("LiveDefinitionSelectionDialog", C2188811AlT.LIZIZ(sbLIZ2));
                                    ((C0INF) ListProtector.get(c0ink3.LLILLJJLI, i4)).LIZJ = true;
                                    RecyclerView recyclerView = c0ink3.LL;
                                    C0INI c0ini2 = (C0INI) (recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i4) : null);
                                    if (c0ini2 != null) {
                                        ConstraintLayout constraintLayout = c0ini2.LL;
                                        if (constraintLayout != null) {
                                            constraintLayout.setSelected(true);
                                        }
                                        C16F5 c16f5 = c0ini2.LLILLJJLI;
                                        if (c16f5 != null) {
                                            c16f5.setSelected(true);
                                        }
                                        C20744016Fi c20744016Fi = c0ini2.LLILLL;
                                        if (c20744016Fi != null) {
                                            c20744016Fi.setChecked(true);
                                        }
                                    }
                                    C0INK c0ink4 = c0ink;
                                    int i5 = i3;
                                    c0ink4.getClass();
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("unSelectItem. position=");
                                    sbLIZ3.append(i5);
                                    C20441214yg.LJIIIZ("LiveDefinitionSelectionDialog", C2188811AlT.LIZIZ(sbLIZ3));
                                    ((C0INF) ListProtector.get(c0ink4.LLILLJJLI, i5)).LIZJ = false;
                                    RecyclerView recyclerView2 = c0ink4.LL;
                                    C0INI c0ini3 = (C0INI) (recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(i5) : null);
                                    if (c0ini3 != null) {
                                        ConstraintLayout constraintLayout2 = c0ini3.LL;
                                        if (constraintLayout2 != null) {
                                            constraintLayout2.setSelected(false);
                                        }
                                        C16F5 c16f52 = c0ini3.LLILLJJLI;
                                        if (c16f52 != null) {
                                            c16f52.setSelected(false);
                                        }
                                        C20744016Fi c20744016Fi2 = c0ini3.LLILLL;
                                        if (c20744016Fi2 != null) {
                                            c20744016Fi2.setChecked(false);
                                        }
                                    }
                                    C0INK c0ink5 = c0ink;
                                    c0ink5.LLILZLL = i2;
                                    c0ink5.LLILZIL.e3();
                                }
                                c0ink.LLIZLLLIL = false;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("LiveDefinitionSelectionDialog$DefinitionListAdapter@8557.handleAudienceItemSelect$2$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("LiveDefinitionSelectionDialog$DefinitionListAdapter@8557.handleAudienceItemSelect$2$1");
                            }
                        });
                    }
                });
            }
        }
    }

    public final void LLLI(PushStreamInfo.Quality quality, boolean z) {
        int i;
        Context context;
        String string;
        if (Intrinsics.LJFF("auto", quality.sdkKey.toLowerCase(Locale.ROOT))) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C20337914i1<Long> c20337914i1 = InterfaceC772390URp.z;
            if (jCurrentTimeMillis - c20337914i1.LIZIZ().longValue() > 86400000) {
                C766270U4b.LIZLLL(2131844645);
                c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
                return;
            }
            return;
        }
        if (z) {
            i = 2131844048;
        } else {
            i = 2131841322;
        }
        String str = quality.name;
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        } else {
            context = null;
        }
        Activity activityLJIJ = C520010KaN.LJIJ(context, false);
        if (activityLJIJ == null || (string = activityLJIJ.getString(i, str)) == null) {
            string = "";
        }
        C766270U4b.LJIIJJI(string);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String lowerCase;
        C0INI c0ini = (C0INI) viewHolder;
        C0INF c0inf = (C0INF) ListProtector.get(this.LLILLJJLI, i);
        C20744016Fi c20744016Fi = c0ini.LLILLL;
        if (c20744016Fi != null) {
            c20744016Fi.setClickable(false);
        }
        String strLIZIZ = c0inf.LIZ;
        if (GameLiveVideoQualityOptV2EnableSetting.INSTANCE.enable()) {
            String str = c0inf.LIZIZ;
            String lowerCase2 = null;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            if (Intrinsics.LJFF(lowerCase, "auto") && c0inf.LIZJ && !c0inf.LIZLLL) {
                if (C500260Jjc.LJJIIZ(c0inf.LJ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append('(');
                    String str2 = (String) ((LinkedHashMap) C0IMN.LIZLLL).get(c0inf.LJ);
                    if (str2 != null) {
                        lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    }
                    sbLIZ.append(lowerCase2);
                    sbLIZ.append(')');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append('(');
                    String str3 = (String) ((LinkedHashMap) C0IMN.LIZLLL).get(C0INE.LIZIZ());
                    if (str3 != null) {
                        lowerCase2 = str3.toLowerCase(Locale.ROOT);
                    }
                    sbLIZ2.append(lowerCase2);
                    sbLIZ2.append(')');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
        C16F5 c16f5 = c0ini.LLILLJJLI;
        if (c16f5 != null) {
            c16f5.setText(strLIZIZ);
        }
        C20744016Fi c20744016Fi2 = c0ini.LLILLL;
        if (c20744016Fi2 != null) {
            c20744016Fi2.setChecked(c0inf.LIZJ);
        }
        ConstraintLayout constraintLayout = c0ini.LL;
        if (constraintLayout != null) {
            constraintLayout.setSelected(c0inf.LIZJ);
        }
        C16F5 c16f52 = c0ini.LLILLJJLI;
        if (c16f52 != null) {
            c16f52.setSelected(c0inf.LIZJ);
        }
        C16F5 c16f53 = c0ini.LLILLJJLI;
        if (c16f53 != null) {
            C786410Ut5.l8(c16f53, new ACListenerS111S0200000_7(this, c0ini, 9));
        }
        C786410Ut5.I7(new ACListenerS111S0200000_7(this, c0ini, 10), c0ini.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (C0IN9.LIZ()) {
            i2 = R.layout.g5j;
        } else {
            i2 = R.layout.g5i;
        }
        C0INI c0ini = new C0INI(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i2, viewGroup, false));
        try {
            View view = c0ini.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ini.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ini.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0INI.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ini.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ini.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0INI.class.getName();
        return c0ini;
    }

    public C0INK(RecyclerView recyclerView, List<C0INF> list, boolean z, DataChannel dataChannel, C0INJ c0inj) {
        this.LL = recyclerView;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = dataChannel;
        this.LLILZIL = c0inj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C0INF) ListProtector.get(this.LLILLJJLI, i)).LIZJ) {
                this.LLILZLL = i;
                return;
            }
        }
    }
}
