package X;

import android.content.Context;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706500RnU {
    public static final Context LIZ(final Context context, String str) {
        if (context == null || !C707060RoO.LIZIZ().forceWrapContextForPreload) {
            return context;
        }
        int iHashCode = str.hashCode();
        final int i = R.style.y0;
        if (iHashCode != -1881346970) {
            if (iHashCode != -1542428094) {
                if (iHashCode == 823486956 && str.equals("common_feed_layout_video_title")) {
                    final int i2 = R.style.hk;
                    return new ContextThemeWrapper(context, i2) { // from class: X.09nw
                        public final Context LIZ;

                        public final int hashCode() {
                            return this.LIZ.hashCode();
                        }

                        @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper
                        public final void attachBaseContext(Context context2) {
                            if (NxRewordManager.LJIILIIL) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("attachBaseContextWrapper: ");
                                sbLIZ.append(Log.getStackTraceString(new Throwable(context2.toString())));
                                C2188811AlT.LIZIZ(sbLIZ);
                                context2 = new C817700W5w(context2, false);
                            }
                            super.attachBaseContext(context2);
                        }

                        public final boolean equals(Object obj) {
                            C2481409nw c2481409nw;
                            if (this == obj) {
                                return true;
                            }
                            Class<?> cls = null;
                            if (obj != null) {
                                cls = obj.getClass();
                            }
                            if (!Intrinsics.LJFF(C2481409nw.class, cls) || !(obj instanceof C2481409nw) || (c2481409nw = (C2481409nw) obj) == null) {
                                return false;
                            }
                            return this.LIZ.equals(c2481409nw.LIZ);
                        }

                        {
                            super(context, i2);
                            this.LIZ = context;
                        }
                    };
                }
            } else if (str.equals("story_layout_user_avatar")) {
                return new ContextThemeWrapper(context, i) { // from class: X.09nw
                    public final Context LIZ;

                    public final int hashCode() {
                        return this.LIZ.hashCode();
                    }

                    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper
                    public final void attachBaseContext(Context context2) {
                        if (NxRewordManager.LJIILIIL) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("attachBaseContextWrapper: ");
                            sbLIZ.append(Log.getStackTraceString(new Throwable(context2.toString())));
                            C2188811AlT.LIZIZ(sbLIZ);
                            context2 = new C817700W5w(context2, false);
                        }
                        super.attachBaseContext(context2);
                    }

                    public final boolean equals(Object obj) {
                        C2481409nw c2481409nw;
                        if (this == obj) {
                            return true;
                        }
                        Class<?> cls = null;
                        if (obj != null) {
                            cls = obj.getClass();
                        }
                        if (!Intrinsics.LJFF(C2481409nw.class, cls) || !(obj instanceof C2481409nw) || (c2481409nw = (C2481409nw) obj) == null) {
                            return false;
                        }
                        return this.LIZ.equals(c2481409nw.LIZ);
                    }

                    {
                        super(context, i);
                        this.LIZ = context;
                    }
                };
            }
        } else if (str.equals("story_quick_dm_bottom_bar_dark_mode")) {
            return new ContextThemeWrapper(context, i) { // from class: X.09nw
                public final Context LIZ;

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper
                public final void attachBaseContext(Context context2) {
                    if (NxRewordManager.LJIILIIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("attachBaseContextWrapper: ");
                        sbLIZ.append(Log.getStackTraceString(new Throwable(context2.toString())));
                        C2188811AlT.LIZIZ(sbLIZ);
                        context2 = new C817700W5w(context2, false);
                    }
                    super.attachBaseContext(context2);
                }

                public final boolean equals(Object obj) {
                    C2481409nw c2481409nw;
                    if (this == obj) {
                        return true;
                    }
                    Class<?> cls = null;
                    if (obj != null) {
                        cls = obj.getClass();
                    }
                    if (!Intrinsics.LJFF(C2481409nw.class, cls) || !(obj instanceof C2481409nw) || (c2481409nw = (C2481409nw) obj) == null) {
                        return false;
                    }
                    return this.LIZ.equals(c2481409nw.LIZ);
                }

                {
                    super(context, i);
                    this.LIZ = context;
                }
            };
        }
        return context;
    }

    public static final String LIZIZ(int i, Context context) {
        Object c098200Yq;
        try {
            c098200Yq = context.getResources().getResourceEntryName(i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        return (String) c098200Yq;
    }
}
