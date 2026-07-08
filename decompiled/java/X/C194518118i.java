package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS93S0300000_29;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.118i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194518118i {
    public static final /* synthetic */ int LIZ = 0;

    public static C118Y LIZIZ(EnumC1430380nKG enumC1430380nKG) {
        int i = C1430370nKF.LIZ[enumC1430380nKG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new C118Y() { // from class: X.118h
                        @Override // X.InterfaceC194510118a
                        public final int LIZ() {
                            return R.layout.i9p;
                        }
                    };
                }
                return new C194530118u();
            }
            return new C194530118u();
        }
        return new C194530118u() { // from class: X.118v
            @Override // X.C118Y, X.InterfaceC194510118a
            public final int LIZLLL() {
                return 2131847276;
            }
        };
    }

    public static AbstractC194523118n LIZ(final AnonymousClass1192 anonymousClass1192, EnumC1430380nKG enumC1430380nKG) {
        int i = C1430370nKF.LIZ[enumC1430380nKG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new AbstractC194523118n(anonymousClass1192) { // from class: X.118j
                        @Override // X.AbstractC194523118n
                        public final void LIZ(C1117360fBO c1117360fBO, final AnonymousClass1192 anonymousClass11922, String str) {
                            c1117360fBO.LLLI(AnchorCell.class, new AnonymousClass1194<AnchorCell, RecyclerView.ViewHolder>(anonymousClass11922) { // from class: X.118k
                                @Override // X.C0J8P
                                /* JADX INFO: renamed from: LJ */
                                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                                    final View view = new View(viewGroup.getContext());
                                    return new RecyclerView.ViewHolder(view) { // from class: X.118t
                                    };
                                }

                                @Override // X.C0J8P
                                public final /* bridge */ /* synthetic */ void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                                }
                            });
                        }
                    };
                }
                return new AbstractC194523118n(anonymousClass1192) { // from class: X.118l
                    @Override // X.AbstractC194523118n
                    public final void LIZ(C1117360fBO c1117360fBO, final AnonymousClass1192 anonymousClass11922, final String str) {
                        c1117360fBO.LLLI(AnchorCell.class, new AnonymousClass1194<AnchorCell, AnonymousClass1198>(anonymousClass11922, str) { // from class: X.1199
                            public final String LIZLLL;

                            {
                                this.LIZLLL = str;
                            }

                            @Override // X.C0J8P
                            public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                                String str2;
                                ArrayList<String> arrayList;
                                AnonymousClass1198 anonymousClass1198 = (AnonymousClass1198) viewHolder;
                                AnchorCell anchorCell = (AnchorCell) obj;
                                anonymousClass1198.getClass();
                                AnchorIcon anchorIcon = anchorCell.icon;
                                if (anchorIcon == null || (arrayList = anchorIcon.urlList) == null || (str2 = (String) ListProtector.get(arrayList, 0)) == null) {
                                    str2 = "";
                                }
                                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                                c1331670kl3LJIIIZ.LJJ(anonymousClass1198.LL);
                                C786410Ut5.h3(c1331670kl3LJIIIZ);
                                anonymousClass1198.LLILLJJLI.setText(anchorCell.title);
                                C786410Ut5.U8(anonymousClass1198.LLILLL, new ACListenerS131S0200000_29(anchorCell, anonymousClass1198.LLILZ, 3));
                            }

                            @Override // X.C0J8P
                            /* JADX INFO: renamed from: LJ */
                            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                                return new AnonymousClass1198(this, C786410Ut5.Td(layoutInflater, R.layout.cun, viewGroup, false));
                            }
                        });
                    }
                };
            }
            return new AbstractC194523118n(anonymousClass1192) { // from class: X.118m
                @Override // X.AbstractC194523118n
                public final void LIZ(C1117360fBO c1117360fBO, final AnonymousClass1192 anonymousClass11922, String str) {
                    c1117360fBO.LLLI(LiveEventModule.class, new AnonymousClass1194<LiveEventModule, C119A>(anonymousClass11922) { // from class: X.119B
                        public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(649));

                        public final boolean LJIIIIZZ() {
                            return ((Boolean) this.LIZLLL.getValue()).booleanValue();
                        }

                        @Override // X.C0J8P
                        public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                            String strLJIIJJI;
                            String strLJIIJJI2;
                            C119A c119a = (C119A) viewHolder;
                            LiveEventModule liveEventModule = (LiveEventModule) obj;
                            c119a.getClass();
                            C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.drawable.c7m);
                            c1331670kl3LJFF.LJJ(c119a.LL);
                            C786410Ut5.h3(c1331670kl3LJFF);
                            TextView textView = c119a.LLILLJJLI;
                            int i2 = 0;
                            if (c119a.LLILZLL.LJIIIIZZ()) {
                                if (liveEventModule.LIZ()) {
                                    if (!liveEventModule.LIZ() || (strLJIIJJI = liveEventModule.periodicTitle) == null || strLJIIJJI.length() == 0) {
                                        strLJIIJJI = liveEventModule.title;
                                    }
                                } else {
                                    strLJIIJJI = C2215101Bmm.LJIIJJI(liveEventModule.startTime);
                                }
                            } else {
                                strLJIIJJI = liveEventModule.title;
                            }
                            textView.setText(strLJIIJJI);
                            TextView textView2 = c119a.LLILLL;
                            if (c119a.LLILZLL.LJIIIIZZ()) {
                                strLJIIJJI2 = liveEventModule.title;
                            } else {
                                strLJIIJJI2 = C2215101Bmm.LJIIJJI(liveEventModule.startTime);
                            }
                            textView2.setText(strLJIIJJI2);
                            c119a.LLILZ.setChecked(liveEventModule.LIZ);
                            if (liveEventModule.LIZIZ) {
                                C786410Ut5.LJLLLLLL(8, c119a.LLILZIL);
                            }
                            if (c119a.LLILZLL.LJIIIIZZ()) {
                                C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), c119a.LLILLL);
                            }
                            SmartImageView smartImageView = c119a.LL;
                            if (c119a.LLILZLL.LJIIIIZZ()) {
                                i2 = 8;
                            }
                            C786410Ut5.LLFF(i2, smartImageView);
                            C786410Ut5.I7(new ACListenerS93S0300000_29(liveEventModule, c119a.LLILZLL, c119a, 5), c119a.itemView);
                        }

                        @Override // X.C0J8P
                        /* JADX INFO: renamed from: LJ */
                        public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                            return new C119A(this, C786410Ut5.Td(layoutInflater, R.layout.cum, viewGroup, false));
                        }
                    });
                }
            };
        }
        return new AbstractC194523118n(anonymousClass1192) { // from class: X.118l
            @Override // X.AbstractC194523118n
            public final void LIZ(C1117360fBO c1117360fBO, final AnonymousClass1192 anonymousClass11922, final String str) {
                c1117360fBO.LLLI(AnchorCell.class, new AnonymousClass1194<AnchorCell, AnonymousClass1198>(anonymousClass11922, str) { // from class: X.1199
                    public final String LIZLLL;

                    {
                        this.LIZLLL = str;
                    }

                    @Override // X.C0J8P
                    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                        String str2;
                        ArrayList<String> arrayList;
                        AnonymousClass1198 anonymousClass1198 = (AnonymousClass1198) viewHolder;
                        AnchorCell anchorCell = (AnchorCell) obj;
                        anonymousClass1198.getClass();
                        AnchorIcon anchorIcon = anchorCell.icon;
                        if (anchorIcon == null || (arrayList = anchorIcon.urlList) == null || (str2 = (String) ListProtector.get(arrayList, 0)) == null) {
                            str2 = "";
                        }
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                        c1331670kl3LJIIIZ.LJJ(anonymousClass1198.LL);
                        C786410Ut5.h3(c1331670kl3LJIIIZ);
                        anonymousClass1198.LLILLJJLI.setText(anchorCell.title);
                        C786410Ut5.U8(anonymousClass1198.LLILLL, new ACListenerS131S0200000_29(anchorCell, anonymousClass1198.LLILZ, 3));
                    }

                    @Override // X.C0J8P
                    /* JADX INFO: renamed from: LJ */
                    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        return new AnonymousClass1198(this, C786410Ut5.Td(layoutInflater, R.layout.cun, viewGroup, false));
                    }
                });
            }
        };
    }
}
