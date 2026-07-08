package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.QueryInfoStickerResponse;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0seU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635120seU {
    public static final EffectChannelResponse LIZ = new EffectChannelResponse(null, null, null, null, new ArrayList(), new ArrayList(), new EffectPanelModel(null, null, new UrlModel(new ArrayList(), null, null, null, null), new ArrayList(), null, null), new ArrayList(), new ArrayList(), null, false);
    public static final EffectCategoryResponse LIZIZ;

    static {
        new QueryInfoStickerResponse(null, null, 0);
        C13BV c13bv = C13BV.INSTANCE;
        LIZIZ = new EffectCategoryResponse("", "", "", null, null, null, null, c13bv, c13bv, "", null, false, null, 7288, null);
    }

    public static final Exception LJIIIZ(ExceptionResult exceptionResult) {
        Exception runtimeException;
        String msg;
        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed on fetch from effect platform, msg: ");
            Integer numValueOf = null;
            if (exceptionResult != null) {
                msg = exceptionResult.getMsg();
            } else {
                msg = null;
            }
            sbLIZ.append(msg);
            sbLIZ.append(", code: ");
            if (exceptionResult != null) {
                numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
            }
            sbLIZ.append(numValueOf);
            runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return runtimeException;
    }

    public static final void LJIIIIZZ(final InterfaceC1635390sev interfaceC1635390sev, final String str, boolean z, final int i, boolean z2, final boolean z3, final IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (!z2) {
            if (z) {
                interfaceC1635390sev.LJJIJIL(str, C2097608Jq.LJ(), iFetchEffectChannelListener);
                return;
            } else {
                InterfaceC1635390sev.LJJLIIIIJ.getClass();
                interfaceC1635390sev.LJJIJL(str, null, 0, null, new AnonymousClass0908(iFetchEffectChannelListener, interfaceC1635390sev, str));
                return;
            }
        }
        if (z) {
            interfaceC1635390sev.LJJIJIL(str, C2097608Jq.LJ(), iFetchEffectChannelListener);
        } else {
            InterfaceC1635390sev.LJJLIIIIJ.getClass();
            interfaceC1635390sev.LJJIJL(str, null, 0, null, new ICheckChannelListener() { // from class: X.0sf1
                public final /* synthetic */ boolean LIZLLL = false;

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    final InterfaceC1635390sev interfaceC1635390sev2 = interfaceC1635390sev;
                    final String str2 = str;
                    EnumC1285060jXs enumC1285060jXs = EnumC1285060jXs.ENABLE;
                    final boolean z4 = this.LIZLLL;
                    final int i2 = i;
                    final IFetchEffectChannelListener iFetchEffectChannelListener2 = iFetchEffectChannelListener;
                    interfaceC1635390sev2.LJJII(str2, enumC1285060jXs, z4, i2, new IFetchEffectChannelListener() { // from class: X.0sf2
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                        public final void onFail(ExceptionResult exceptionResult2) {
                            interfaceC1635390sev2.LJJII(str2, EnumC1285060jXs.DISABLE, z4, i2, iFetchEffectChannelListener2);
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                            if (effectChannelResponse2.getAllCategoryEffects().size() == 0) {
                                interfaceC1635390sev2.LJJII(str2, EnumC1285060jXs.DISABLE, z4, i2, iFetchEffectChannelListener2);
                            } else {
                                iFetchEffectChannelListener2.onSuccess(effectChannelResponse2);
                            }
                        }
                    });
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z4) {
                    EnumC1285060jXs enumC1285060jXs;
                    if (!z4 && !z3) {
                        final InterfaceC1635390sev interfaceC1635390sev2 = interfaceC1635390sev;
                        final String str2 = str;
                        EnumC1285060jXs enumC1285060jXs2 = EnumC1285060jXs.ENABLE;
                        final boolean z5 = this.LIZLLL;
                        final int i2 = i;
                        final IFetchEffectChannelListener iFetchEffectChannelListener2 = iFetchEffectChannelListener;
                        interfaceC1635390sev2.LJJII(str2, enumC1285060jXs2, z5, i2, new IFetchEffectChannelListener() { // from class: X.0sf0
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                            public final void onFail(ExceptionResult exceptionResult) {
                                interfaceC1635390sev2.LJJII(str2, EnumC1285060jXs.DISABLE, z5, i2, iFetchEffectChannelListener2);
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                                final EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                                C11O8 c11o8LJJJLZIJ = C11NZ.LJIJJLI(new C1769906wT(effectChannelResponse2, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                                final InterfaceC1635390sev interfaceC1635390sev3 = interfaceC1635390sev2;
                                final String str3 = str2;
                                final boolean z6 = z5;
                                final int i3 = i2;
                                final IFetchEffectChannelListener iFetchEffectChannelListener3 = iFetchEffectChannelListener2;
                                c11o8LJJJLZIJ.LJJLJLI(new C09JN() { // from class: X.0sez
                                    @Override // X.C09JN
                                    public final void accept(Object obj) {
                                        C1C7U.LIZ("EffectPlatformFunctionsKt@9d78.fetchBeautyComponentList$1$checkChannelSuccess$1$onSuccess$2");
                                        if (((Boolean) obj).booleanValue()) {
                                            interfaceC1635390sev3.LJJII(str3, EnumC1285060jXs.DISABLE, z6, i3, iFetchEffectChannelListener3);
                                        } else {
                                            iFetchEffectChannelListener3.onSuccess(effectChannelResponse2);
                                        }
                                        C1C7U.LIZIZ("EffectPlatformFunctionsKt@9d78.fetchBeautyComponentList$1$checkChannelSuccess$1$onSuccess$2");
                                    }
                                });
                            }
                        });
                        return;
                    }
                    InterfaceC1635390sev interfaceC1635390sev3 = interfaceC1635390sev;
                    String str3 = str;
                    if (z4) {
                        enumC1285060jXs = EnumC1285060jXs.DEFAULT;
                    } else {
                        enumC1285060jXs = EnumC1285060jXs.DISABLE;
                    }
                    interfaceC1635390sev3.LJJII(str3, enumC1285060jXs, this.LIZLLL, i, iFetchEffectChannelListener);
                }
            });
        }
    }

    public static final void LIZIZ(final InterfaceC1635390sev interfaceC1635390sev, final String str, final String str2, final int i, final int i2, final int i3, final String str3, final IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        InterfaceC1635390sev.LJJLIIIIJ.getClass();
        interfaceC1635390sev.LJJIJL(str, str2, 1, null, new ICheckChannelListener() { // from class: X.08ut
            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelFailed(ExceptionResult exceptionResult) {
                InterfaceC1635390sev interfaceC1635390sev2 = interfaceC1635390sev;
                String str4 = str;
                String str5 = str2;
                C1635120seU.LIZ(i, i2, i3, 0, iFetchCategoryEffectListener, interfaceC1635390sev2, str4, str5, str3, null, true);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                C1635120seU.LIZ(i, i2, i3, 0, iFetchCategoryEffectListener, interfaceC1635390sev, str, str2, str3, null, !z);
            }
        });
    }

    public static final void LIZLLL(final int i, final int i2, final int i3, int i4, final IFetchCategoryEffectListener iFetchCategoryEffectListener, final InterfaceC1635390sev interfaceC1635390sev, final String str, final String str2, final String str3, final Map map) {
        if (i4 != 0) {
            LIZ(i, i2, i3, i4, iFetchCategoryEffectListener, interfaceC1635390sev, str, str2, str3, map, false);
        } else {
            InterfaceC1635390sev.LJJLIIIIJ.getClass();
            interfaceC1635390sev.LJJIJL(str, str2, 1, null, new ICheckChannelListener() { // from class: X.0seW
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    InterfaceC1635390sev interfaceC1635390sev2 = interfaceC1635390sev;
                    String str4 = str;
                    String str5 = str2;
                    interfaceC1635390sev2.LJJJ(i, i2, i3, 0, iFetchCategoryEffectListener, str4, str5, str3, map, true);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z) {
                    C1635120seU.LIZ(i, i2, i3, 0, iFetchCategoryEffectListener, interfaceC1635390sev, str, str2, str3, map, !z);
                }
            });
        }
    }

    public static final void LIZ(final int i, final int i2, final int i3, int i4, final IFetchCategoryEffectListener iFetchCategoryEffectListener, final InterfaceC1635390sev interfaceC1635390sev, final String str, final String str2, final String str3, Map map, final boolean z) {
        interfaceC1635390sev.LJJJ(i, i2, i3, i4, new IFetchCategoryEffectListener() { // from class: X.0seX
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                interfaceC1635390sev.LJJJJ(i, i2, i3, iFetchCategoryEffectListener, str, str2, str3, !z);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                iFetchCategoryEffectListener.onSuccess(categoryPageModel);
            }
        }, str, str2, str3, map, z);
    }

    public static final void LJI(final InterfaceC1635390sev interfaceC1635390sev, final String str, final boolean z, final String str2, final int i, final int i2, final IFetchPanelInfoListener iFetchPanelInfoListener, final boolean z2, final boolean z3, int i3, final Map<String, String> map) {
        interfaceC1635390sev.LJJIZ(str, z, str2, i, i2, z2, z3, i3, new IFetchPanelInfoListener() { // from class: X.0seV
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                interfaceC1635390sev.LJJIZ(str, z, str2, i, i2, !z2, z3, 0, iFetchPanelInfoListener, map);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                iFetchPanelInfoListener.onSuccess(panelInfoModel);
            }
        }, map);
    }

    public static final void LJFF(final InterfaceC1635390sev interfaceC1635390sev, final String str, final boolean z, final String str2, final int i, final int i2, int i3, String str3, final boolean z2, boolean z3, final Map<String, String> map, final IFetchPanelInfoListener iFetchPanelInfoListener, boolean z4, boolean z5, int i4, boolean z6, int i5) {
        String str4 = str3;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("combineFetchPanelInfo fetchFromCache = ");
        sbLIZ.append(z6);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("EffectPlatformFunctions", strLIZIZ);
        if (Intrinsics.LJFF(str, "default") && z5) {
            if (str4 == null) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            interfaceC1635390sev.LJJIFFI(str, i4, i2, i3, str4, C2097608Jq.LJ(), iFetchPanelInfoListener, z6);
            return;
        }
        if (z4) {
            interfaceC1635390sev.LJIIIZ(str, z, str2, i, i2, map, iFetchPanelInfoListener, z6);
            return;
        }
        if ((Intrinsics.LJFF(str, "default") || Intrinsics.LJFF(str, "livestreaming")) && z3) {
            interfaceC1635390sev.LJIIIZ(str, z, str2, i, i2, C2097608Jq.LJ(), new IFetchPanelInfoListener() { // from class: X.0sbR
                public final /* synthetic */ boolean LJII = false;

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    interfaceC1635390sev.LJIIIZ(str, z, str2, i, i2, C2097608Jq.LJ(), iFetchPanelInfoListener, !this.LJII);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(PanelInfoModel panelInfoModel) {
                    iFetchPanelInfoListener.onSuccess(panelInfoModel);
                }
            }, false);
        } else if (z6) {
            interfaceC1635390sev.LJJIZ(str, z, str2, i, i2, true, z2, i5, iFetchPanelInfoListener, map);
        } else {
            if (i5 != 0) {
                LJI(interfaceC1635390sev, str, z, str2, i, i2, iFetchPanelInfoListener, false, z2, i5, map);
                return;
            }
            InterfaceC1635390sev.LJJLIIIIJ.getClass();
            final int i6 = 0;
            interfaceC1635390sev.LJJIJL(str, str2, 2, null, new ICheckChannelListener() { // from class: X.0seT
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    String msg;
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("checkUpdate failed e = ");
                    if (exceptionResult != null) {
                        msg = exceptionResult.getMsg();
                    } else {
                        msg = null;
                    }
                    sbLIZ2.append(msg);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZ("effect_request_chine_tag", strLIZIZ2);
                    interfaceC1635390sev.LJJIZ(str, z, str2, i, i2, true, z2, i6, iFetchPanelInfoListener, map);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z7) {
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("checkChannelSuccess needUpdate = ");
                    sbLIZ2.append(z7);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZ("effect_request_chine_tag", strLIZIZ2);
                    C1635120seU.LJI(interfaceC1635390sev, str, z, str2, i, i2, iFetchPanelInfoListener, !z7, z2, i6, map);
                }
            });
        }
    }
}
