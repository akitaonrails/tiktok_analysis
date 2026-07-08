package com.bytedance.android.live.service.initializer;

import X.C006A;
import X.InterfaceC1161930gLH;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.android.livesdkapi.host.IHostCompose;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostEcommerce;
import com.bytedance.android.livesdkapi.host.IHostEvent;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.host.IHostFriends;
import com.bytedance.android.livesdkapi.host.IHostGatekeeper;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.android.livesdkapi.host.IHostInputService;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostOffline;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.bytedance.android.livesdkapi.host.IHostPgcSubsService;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostPullStreamTool;
import com.bytedance.android.livesdkapi.host.IHostPush;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.android.livesdkapi.host.IHostStarshipStrategyService;
import com.bytedance.android.livesdkapi.host.IHostStoryService;
import com.bytedance.android.livesdkapi.host.IHostStrategy;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.host.IHostTux;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.IHostWarlock;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckService;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckServiceV2;
import com.bytedance.android.livesdkapi.host.IProbeSDK;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.ss.android.ugc.aweme.live.hostbusiness.AdLiveHelperService;
import com.ss.android.ugc.aweme.live.livehostimpl.HostPgcSubsServiceImpl;
import com.ss.android.ugc.aweme.live.livehostimpl.HostStarshipStrategyService;
import com.ss.android.ugc.aweme.live.livehostimpl.HostStoryService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostAction;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostAppContext;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostBridge;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostCommerce;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostCompose;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostConfig;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostCreativeTool;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostEcommerce;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostEvent;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostFrescoHelper;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostFriends;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostGameService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostGatekeeper;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostHybrid;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostIM;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostInputService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostMonitorAndLog;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostMultiCanvasService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostNetwork;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostOffline;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPCS;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPad;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPerformanceMonitor;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPerformanceOpt;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPersonalized;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPlugin;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPullStreamTool;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPush;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostResource;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSandbox;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSetting;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostShare;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSignalService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostStatusChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostStatusCheckerV2;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostStrategyService;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSubscription;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostTux;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostUser;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWarlock;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import com.ss.android.ugc.aweme.live.livehostimpl.ProbeSDK;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class HostServiceInitializer implements InterfaceC1161930gLH {
    public static final int $stable = 8;
    public IAdLiveHelperService adLiveHelperService;
    public IHostAction hostAction;
    public IHostAppContext hostAppContext;
    public IHostBridge hostBridge;
    public IHostCommerce hostCommerce;
    public IHostCompose hostCompose;
    public IHostConfig hostConfig;
    public IHostCreativeTool hostCreativeTool;
    public IHostEcommerce hostEcommerce;
    public IHostEvent hostEvent;
    public IHostFrescoHelper hostFrescoHelper;
    public IHostFriends hostFriends;
    public IHostGatekeeper hostGatekeeper;
    public IHostHybrid hostHybrid;
    public IHostIM hostIM;
    public IHostInputService hostInputService;
    public IHostMonitorAndLog hostMonitorAndLog;
    public IHostMultiCanvas hostMultiCanvas;
    public IHostNetwork hostNetwork;
    public IHostOffline hostOffline;
    public IHostPCS hostPCS;
    public IHostPad hostPad;
    public IHostPerformanceMonitor hostPerformanceMonitor;
    public IHostPerformanceOpt hostPerformanceOpt;
    public IHostPersonalized hostPersonalized;
    public IHostPgcSubsService hostPgcSubsService;
    public IHostPlugin hostPlugin;
    public IHostPullStreamTool hostPullStreamTool;
    public IHostPush hostPush;
    public IHostResource hostResource;
    public IHostSetting hostSetting;
    public IHostShare hostShare;
    public IHostSignalService hostSignalService;
    public IHostStarshipStrategyService hostStarshipStrategyService;
    public IHostStoryService hostStoryService;
    public IHostStrategy hostStrategy;
    public IHostSubscription hostSubscription;
    public IHostTux hostTux;
    public IHostUser hostUser;
    public IHostWarlock hostWarlock;
    public IHostWatch hostWatch;
    public ILiveGameService liveGameService;
    public ILiveHostSandbox liveHostSandbox;
    public ILiveStatusCheckService liveStatusCheckService;
    public ILiveStatusCheckServiceV2 liveStatusCheckServiceV2;
    public IProbeSDK probeSDK;
    public final Class<?>[] serviceTypes = {IHostMonitorAndLog.class, IAdLiveHelperService.class, IHostAction.class, IHostAppContext.class, IHostBridge.class, IHostCommerce.class, IHostCompose.class, IHostConfig.class, IHostCreativeTool.class, IHostEcommerce.class, IHostEvent.class, IHostFrescoHelper.class, IHostFriends.class, IHostGatekeeper.class, IHostHybrid.class, IHostIM.class, IHostInputService.class, IHostNetwork.class, IHostOffline.class, IHostPCS.class, IHostPerformanceMonitor.class, IHostPerformanceOpt.class, IHostPersonalized.class, IHostPgcSubsService.class, IHostPlugin.class, IHostPullStreamTool.class, IHostPush.class, IHostResource.class, IHostSetting.class, IHostShare.class, IHostSignalService.class, IHostStarshipStrategyService.class, IHostStoryService.class, IHostStrategy.class, IHostSubscription.class, IHostTux.class, IHostUser.class, IHostWarlock.class, IHostWatch.class, ILiveGameService.class, ILiveHostSandbox.class, ILiveStatusCheckService.class, ILiveStatusCheckServiceV2.class, IProbeSDK.class, IHostMultiCanvas.class, IHostPad.class};

    private final int getServiceType(Class<?> cls) {
        int length = this.serviceTypes.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.LJFF(cls, this.serviceTypes[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC1161930gLH
    public <T extends C006A> T getService(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        switch (getServiceType(cls)) {
            case 0:
                if (this.hostMonitorAndLog == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostMonitorAndLog == null) {
                                this.hostMonitorAndLog = new LiveHostMonitorAndLog();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IHostMonitorAndLog iHostMonitorAndLog = this.hostMonitorAndLog;
                if (!(iHostMonitorAndLog instanceof C006A)) {
                    return null;
                }
                return iHostMonitorAndLog;
            case 1:
                if (this.adLiveHelperService == null) {
                    synchronized (cls) {
                        try {
                            if (this.adLiveHelperService == null) {
                                this.adLiveHelperService = new AdLiveHelperService();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                IAdLiveHelperService iAdLiveHelperService = this.adLiveHelperService;
                if (!(iAdLiveHelperService instanceof C006A)) {
                    return null;
                }
                return iAdLiveHelperService;
            case 2:
                if (this.hostAction == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostAction == null) {
                                this.hostAction = new LiveHostAction();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                IHostAction iHostAction = this.hostAction;
                if (!(iHostAction instanceof C006A)) {
                    return null;
                }
                return iHostAction;
            case 3:
                if (this.hostAppContext == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostAppContext == null) {
                                this.hostAppContext = new LiveHostAppContext();
                            }
                        } catch (Throwable th22) {
                            throw th22;
                        }
                        break;
                    }
                }
                IHostAppContext iHostAppContext = this.hostAppContext;
                if (!(iHostAppContext instanceof C006A)) {
                    return null;
                }
                return iHostAppContext;
            case 4:
                if (this.hostBridge == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostBridge == null) {
                                this.hostBridge = new LiveHostBridge();
                            }
                        } catch (Throwable th222) {
                            throw th222;
                        }
                        break;
                    }
                }
                IHostBridge iHostBridge = this.hostBridge;
                if (!(iHostBridge instanceof C006A)) {
                    return null;
                }
                return iHostBridge;
            case 5:
                if (this.hostCommerce == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostCommerce == null) {
                                this.hostCommerce = LiveHostCommerce.LL;
                            }
                        } catch (Throwable th2222) {
                            throw th2222;
                        }
                        break;
                    }
                }
                IHostCommerce iHostCommerce = this.hostCommerce;
                if (!(iHostCommerce instanceof C006A)) {
                    return null;
                }
                return iHostCommerce;
            case 6:
                if (this.hostCompose == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostCompose == null) {
                                this.hostCompose = LiveHostCompose.LL;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IHostCompose iHostCompose = this.hostCompose;
                if (!(iHostCompose instanceof C006A)) {
                    return null;
                }
                return iHostCompose;
            case 7:
                if (this.hostConfig == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostConfig == null) {
                                this.hostConfig = new LiveHostConfig();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IHostConfig iHostConfig = this.hostConfig;
                if (!(iHostConfig instanceof C006A)) {
                    return null;
                }
                return iHostConfig;
            case 8:
                if (this.hostCreativeTool == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostCreativeTool == null) {
                                this.hostCreativeTool = new LiveHostCreativeTool();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IHostCreativeTool iHostCreativeTool = this.hostCreativeTool;
                if (!(iHostCreativeTool instanceof C006A)) {
                    return null;
                }
                return iHostCreativeTool;
            case BdTuring.TYPE_ECAF /* 9 */:
                if (this.hostEcommerce == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostEcommerce == null) {
                                this.hostEcommerce = LiveHostEcommerce.LL;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IHostEcommerce iHostEcommerce = this.hostEcommerce;
                if (!(iHostEcommerce instanceof C006A)) {
                    return null;
                }
                return iHostEcommerce;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (this.hostEvent == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostEvent == null) {
                                this.hostEvent = new LiveHostEvent();
                            }
                        } catch (Throwable th22222) {
                            throw th22222;
                        }
                        break;
                    }
                }
                IHostEvent iHostEvent = this.hostEvent;
                if (!(iHostEvent instanceof C006A)) {
                    return null;
                }
                return iHostEvent;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (this.hostFrescoHelper == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostFrescoHelper == null) {
                                this.hostFrescoHelper = new LiveHostFrescoHelper();
                            }
                        } catch (Throwable th222222) {
                            throw th222222;
                        }
                        break;
                    }
                }
                IHostFrescoHelper iHostFrescoHelper = this.hostFrescoHelper;
                if (!(iHostFrescoHelper instanceof C006A)) {
                    return null;
                }
                return iHostFrescoHelper;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (this.hostFriends == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostFriends == null) {
                                this.hostFriends = LiveHostFriends.LL;
                            }
                        } catch (Throwable th2222222) {
                            throw th2222222;
                        }
                        break;
                    }
                }
                IHostFriends iHostFriends = this.hostFriends;
                if (!(iHostFriends instanceof C006A)) {
                    return null;
                }
                return iHostFriends;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                if (this.hostGatekeeper == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostGatekeeper == null) {
                                this.hostGatekeeper = new LiveHostGatekeeper();
                            }
                        } catch (Throwable th22222222) {
                            throw th22222222;
                        }
                        break;
                    }
                }
                IHostGatekeeper iHostGatekeeper = this.hostGatekeeper;
                if (!(iHostGatekeeper instanceof C006A)) {
                    return null;
                }
                return iHostGatekeeper;
            case 14:
                if (this.hostHybrid == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostHybrid == null) {
                                this.hostHybrid = new LiveHostHybrid();
                            }
                        } catch (Throwable th222222222) {
                            throw th222222222;
                        }
                        break;
                    }
                }
                IHostHybrid iHostHybrid = this.hostHybrid;
                if (!(iHostHybrid instanceof C006A)) {
                    return null;
                }
                return iHostHybrid;
            case 15:
                if (this.hostIM == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostIM == null) {
                                this.hostIM = LiveHostIM.LL;
                            }
                        } catch (Throwable th2222222222) {
                            throw th2222222222;
                        }
                        break;
                    }
                }
                IHostIM iHostIM = this.hostIM;
                if (!(iHostIM instanceof C006A)) {
                    return null;
                }
                return iHostIM;
            case 16:
                if (this.hostInputService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostInputService == null) {
                                this.hostInputService = new LiveHostInputService();
                            }
                        } catch (Throwable th22222222222) {
                            throw th22222222222;
                        }
                        break;
                    }
                }
                IHostInputService iHostInputService = this.hostInputService;
                if (!(iHostInputService instanceof C006A)) {
                    return null;
                }
                return iHostInputService;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                if (this.hostNetwork == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostNetwork == null) {
                                this.hostNetwork = new LiveHostNetwork();
                            }
                        } catch (Throwable th222222222222) {
                            throw th222222222222;
                        }
                        break;
                    }
                }
                IHostNetwork iHostNetwork = this.hostNetwork;
                if (!(iHostNetwork instanceof C006A)) {
                    return null;
                }
                return iHostNetwork;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                if (this.hostOffline == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostOffline == null) {
                                this.hostOffline = new LiveHostOffline();
                            }
                        } catch (Throwable th2222222222222) {
                            throw th2222222222222;
                        }
                        break;
                    }
                }
                IHostOffline iHostOffline = this.hostOffline;
                if (!(iHostOffline instanceof C006A)) {
                    return null;
                }
                return iHostOffline;
            case 19:
                if (this.hostPCS == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostPCS == null) {
                                this.hostPCS = new LiveHostPCS();
                            }
                        } catch (Throwable th22222222222222) {
                            throw th22222222222222;
                        }
                        break;
                    }
                }
                IHostPCS iHostPCS = this.hostPCS;
                if (!(iHostPCS instanceof C006A)) {
                    return null;
                }
                return iHostPCS;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                if (this.hostPerformanceMonitor == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostPerformanceMonitor == null) {
                                this.hostPerformanceMonitor = new LiveHostPerformanceMonitor();
                            }
                        } catch (Throwable th222222222222222) {
                            throw th222222222222222;
                        }
                        break;
                    }
                }
                IHostPerformanceMonitor iHostPerformanceMonitor = this.hostPerformanceMonitor;
                if (!(iHostPerformanceMonitor instanceof C006A)) {
                    return null;
                }
                return iHostPerformanceMonitor;
            case 21:
                if (this.hostPerformanceOpt == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostPerformanceOpt == null) {
                                this.hostPerformanceOpt = new LiveHostPerformanceOpt();
                            }
                        } catch (Throwable th2222222222222222) {
                            throw th2222222222222222;
                        }
                        break;
                    }
                }
                IHostPerformanceOpt iHostPerformanceOpt = this.hostPerformanceOpt;
                if (!(iHostPerformanceOpt instanceof C006A)) {
                    return null;
                }
                return iHostPerformanceOpt;
            case 22:
                if (this.hostPersonalized == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostPersonalized == null) {
                                this.hostPersonalized = new LiveHostPersonalized();
                            }
                        } catch (Throwable th22222222222222222) {
                            throw th22222222222222222;
                        }
                        break;
                    }
                }
                IHostPersonalized iHostPersonalized = this.hostPersonalized;
                if (!(iHostPersonalized instanceof C006A)) {
                    return null;
                }
                return iHostPersonalized;
            case 23:
                if (this.hostPgcSubsService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostPgcSubsService == null) {
                                this.hostPgcSubsService = new HostPgcSubsServiceImpl();
                            }
                        } catch (Throwable th222222222222222222) {
                            throw th222222222222222222;
                        }
                        break;
                    }
                }
                IHostPgcSubsService iHostPgcSubsService = this.hostPgcSubsService;
                if (!(iHostPgcSubsService instanceof C006A)) {
                    return null;
                }
                return iHostPgcSubsService;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                if (this.hostPlugin == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostPlugin == null) {
                                this.hostPlugin = new LiveHostPlugin();
                            }
                        } catch (Throwable th2222222222222222222) {
                            throw th2222222222222222222;
                        }
                        break;
                    }
                }
                IHostPlugin iHostPlugin = this.hostPlugin;
                if (!(iHostPlugin instanceof C006A)) {
                    return null;
                }
                return iHostPlugin;
            case 25:
                if (this.hostPullStreamTool == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostPullStreamTool == null) {
                                this.hostPullStreamTool = new LiveHostPullStreamTool();
                            }
                        } catch (Throwable th22222222222222222222) {
                            throw th22222222222222222222;
                        }
                        break;
                    }
                }
                IHostPullStreamTool iHostPullStreamTool = this.hostPullStreamTool;
                if (!(iHostPullStreamTool instanceof C006A)) {
                    return null;
                }
                return iHostPullStreamTool;
            case 26:
                if (this.hostPush == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostPush == null) {
                                this.hostPush = new LiveHostPush();
                            }
                        } catch (Throwable th222222222222222222222) {
                            throw th222222222222222222222;
                        }
                        break;
                    }
                }
                IHostPush iHostPush = this.hostPush;
                if (!(iHostPush instanceof C006A)) {
                    return null;
                }
                return iHostPush;
            case 27:
                if (this.hostResource == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostResource == null) {
                                this.hostResource = new LiveHostResource();
                            }
                        } catch (Throwable th2222222222222222222222) {
                            throw th2222222222222222222222;
                        }
                        break;
                    }
                }
                IHostResource iHostResource = this.hostResource;
                if (!(iHostResource instanceof C006A)) {
                    return null;
                }
                return iHostResource;
            case 28:
                if (this.hostSetting == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostSetting == null) {
                                this.hostSetting = new LiveHostSetting();
                            }
                        } catch (Throwable th22222222222222222222222) {
                            throw th22222222222222222222222;
                        }
                        break;
                    }
                }
                IHostSetting iHostSetting = this.hostSetting;
                if (!(iHostSetting instanceof C006A)) {
                    return null;
                }
                return iHostSetting;
            case 29:
                if (this.hostShare == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostShare == null) {
                                this.hostShare = new LiveHostShare();
                            }
                        } catch (Throwable th222222222222222222222222) {
                            throw th222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostShare iHostShare = this.hostShare;
                if (!(iHostShare instanceof C006A)) {
                    return null;
                }
                return iHostShare;
            case 30:
                if (this.hostSignalService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostSignalService == null) {
                                this.hostSignalService = new LiveHostSignalService();
                            }
                        } catch (Throwable th2222222222222222222222222) {
                            throw th2222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostSignalService iHostSignalService = this.hostSignalService;
                if (!(iHostSignalService instanceof C006A)) {
                    return null;
                }
                return iHostSignalService;
            case 31:
                if (this.hostStarshipStrategyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostStarshipStrategyService == null) {
                                this.hostStarshipStrategyService = new HostStarshipStrategyService();
                            }
                        } catch (Throwable th22222222222222222222222222) {
                            throw th22222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostStarshipStrategyService iHostStarshipStrategyService = this.hostStarshipStrategyService;
                if (!(iHostStarshipStrategyService instanceof C006A)) {
                    return null;
                }
                return iHostStarshipStrategyService;
            case 32:
                if (this.hostStoryService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostStoryService == null) {
                                this.hostStoryService = new HostStoryService();
                            }
                        } catch (Throwable th222222222222222222222222222) {
                            throw th222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostStoryService iHostStoryService = this.hostStoryService;
                if (!(iHostStoryService instanceof C006A)) {
                    return null;
                }
                return iHostStoryService;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                if (this.hostStrategy == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostStrategy == null) {
                                this.hostStrategy = new LiveHostStrategyService();
                            }
                        } catch (Throwable th2222222222222222222222222222) {
                            throw th2222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostStrategy iHostStrategy = this.hostStrategy;
                if (!(iHostStrategy instanceof C006A)) {
                    return null;
                }
                return iHostStrategy;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                if (this.hostSubscription == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostSubscription == null) {
                                this.hostSubscription = new LiveHostSubscription();
                            }
                        } catch (Throwable th22222222222222222222222222222) {
                            throw th22222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostSubscription iHostSubscription = this.hostSubscription;
                if (!(iHostSubscription instanceof C006A)) {
                    return null;
                }
                return iHostSubscription;
            case 35:
                if (this.hostTux == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostTux == null) {
                                this.hostTux = new LiveHostTux();
                            }
                        } catch (Throwable th222222222222222222222222222222) {
                            throw th222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostTux iHostTux = this.hostTux;
                if (!(iHostTux instanceof C006A)) {
                    return null;
                }
                return iHostTux;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                if (this.hostUser == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostUser == null) {
                                this.hostUser = new LiveHostUser();
                            }
                        } catch (Throwable th2222222222222222222222222222222) {
                            throw th2222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostUser iHostUser = this.hostUser;
                if (!(iHostUser instanceof C006A)) {
                    return null;
                }
                return iHostUser;
            case 37:
                if (this.hostWarlock == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostWarlock == null) {
                                this.hostWarlock = new LiveHostWarlock();
                            }
                        } catch (Throwable th22222222222222222222222222222222) {
                            throw th22222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostWarlock iHostWarlock = this.hostWarlock;
                if (!(iHostWarlock instanceof C006A)) {
                    return null;
                }
                return iHostWarlock;
            case 38:
                if (this.hostWatch == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostWatch == null) {
                                this.hostWatch = new LiveHostWatch();
                            }
                        } catch (Throwable th222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostWatch iHostWatch = this.hostWatch;
                if (!(iHostWatch instanceof C006A)) {
                    return null;
                }
                return iHostWatch;
            case 39:
                if (this.liveGameService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveGameService == null) {
                                this.liveGameService = new LiveHostGameService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveGameService iLiveGameService = this.liveGameService;
                if (!(iLiveGameService instanceof C006A)) {
                    return null;
                }
                return iLiveGameService;
            case 40:
                if (this.liveHostSandbox == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveHostSandbox == null) {
                                this.liveHostSandbox = new LiveHostSandbox();
                            }
                        } catch (Throwable th22222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveHostSandbox iLiveHostSandbox = this.liveHostSandbox;
                if (!(iLiveHostSandbox instanceof C006A)) {
                    return null;
                }
                return iLiveHostSandbox;
            case 41:
                if (this.liveStatusCheckService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveStatusCheckService == null) {
                                this.liveStatusCheckService = new LiveHostStatusChecker();
                            }
                        } catch (Throwable th222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveStatusCheckService iLiveStatusCheckService = this.liveStatusCheckService;
                if (!(iLiveStatusCheckService instanceof C006A)) {
                    return null;
                }
                return iLiveStatusCheckService;
            case 42:
                if (this.liveStatusCheckServiceV2 == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveStatusCheckServiceV2 == null) {
                                this.liveStatusCheckServiceV2 = new LiveHostStatusCheckerV2();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveStatusCheckServiceV2 iLiveStatusCheckServiceV2 = this.liveStatusCheckServiceV2;
                if (!(iLiveStatusCheckServiceV2 instanceof C006A)) {
                    return null;
                }
                return iLiveStatusCheckServiceV2;
            case 43:
                if (this.probeSDK == null) {
                    synchronized (cls) {
                        try {
                            if (this.probeSDK == null) {
                                this.probeSDK = new ProbeSDK();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IProbeSDK iProbeSDK = this.probeSDK;
                if (!(iProbeSDK instanceof C006A)) {
                    return null;
                }
                return iProbeSDK;
            case 44:
                if (this.hostMultiCanvas == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostMultiCanvas == null) {
                                this.hostMultiCanvas = new LiveHostMultiCanvasService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostMultiCanvas iHostMultiCanvas = this.hostMultiCanvas;
                if (!(iHostMultiCanvas instanceof C006A)) {
                    return null;
                }
                return iHostMultiCanvas;
            case 45:
                if (this.hostPad == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostPad == null) {
                                this.hostPad = new LiveHostPad();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHostPad iHostPad = this.hostPad;
                if (!(iHostPad instanceof C006A)) {
                    return null;
                }
                return iHostPad;
            default:
                return null;
        }
    }
}
