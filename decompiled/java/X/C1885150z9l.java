package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard;
import com.bytedance.android.livesdk.game.model.CreatorInfo;
import com.bytedance.android.livesdk.game.model.ItemInfo;
import com.bytedance.android.livesdk.game.model.ItemStatisticsInfo;
import com.bytedance.android.livesdk.game.model.UrlInfo;
import com.bytedance.android.livesdk.game.model.VideoInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0z9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885150z9l extends AbstractC21673619ry<C1885120z9i> {
    public final Context LL;
    public final List<C1885390zA9> LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ = true;
    public C1885220z9s LLILZIL;
    public final /* synthetic */ VideoFeedCard LLILZLL;

    public final Map<String, String> LLLFZ() {
        Lifecycle lifecycle;
        Fragment fragment = this.LLILZLL.LLILLL.getHost().getFragment();
        String strValueOf = String.valueOf((fragment == null || (lifecycle = fragment.getLifecycle()) == null) ? 0 : lifecycle.hashCode());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1882420z5M c1882420z5MLIZLLL = C1882380z5I.LIZLLL(this.LLILZLL.LLILLL);
        linkedHashMap.put("game_first_scene", C1882380z5I.LJFF(c1882420z5MLIZLLL, "game_first_scene"));
        linkedHashMap.put("game_second_scene", C1882380z5I.LJFF(c1882420z5MLIZLLL, "game_second_scene"));
        linkedHashMap.put("game_third_scene", C1882380z5I.LJFF(c1882420z5MLIZLLL, "game_third_scene"));
        linkedHashMap.put("game_id", C1882380z5I.LJFF(c1882420z5MLIZLLL, "game_id"));
        linkedHashMap.put("game_name", C1882380z5I.LJFF(c1882420z5MLIZLLL, "game_name"));
        linkedHashMap.put("game_tag_id", C1882380z5I.LJFF(c1882420z5MLIZLLL, "game_tag_id"));
        linkedHashMap.put("game_tag_name", C1882380z5I.LJFF(c1882420z5MLIZLLL, "game_tag_name"));
        linkedHashMap.put("activity_id", strValueOf);
        return linkedHashMap;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size() + (!C1883500z76.LIZIZ(this.LLILZLL) ? 1 : 0);
    }

    public static final void LLLII(TextView textView) {
        if (C497740JfY.LJJ()) {
            if (textView != null) {
                textView.setGravity(5);
                if (textView != null) {
                    textView.setLayoutDirection(1);
                    textView.setTextDirection(1);
                    return;
                }
                return;
            }
            return;
        }
        if (textView == null) {
            return;
        }
        textView.setGravity(3);
        if (textView == null) {
            return;
        }
        textView.setLayoutDirection(0);
        textView.setTextDirection(0);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= this.LLILLJJLI.size()) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        View videoView;
        C1885120z9i c1885120z9i = (C1885120z9i) viewHolder;
        InterfaceC1885140z9k interfaceC1885140z9k = c1885120z9i.LLILLL;
        if (interfaceC1885140z9k != null) {
            interfaceC1885140z9k.pause();
        }
        InterfaceC1885140z9k interfaceC1885140z9k2 = c1885120z9i.LLILLL;
        if (interfaceC1885140z9k2 != null) {
            videoView = interfaceC1885140z9k2.getVideoView();
        } else {
            videoView = null;
        }
        ViewGroup viewGroup = c1885120z9i.LLILLJJLI;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(videoView, viewGroup);
        }
        super.onViewRecycled(c1885120z9i);
    }

    public static void LLLIIIIL(TuxIconView tuxIconView, boolean z) {
        int i;
        if (tuxIconView == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (z) {
            i = R.raw.icon_speaker_x_mark_ltr;
        } else {
            i = R.raw.icon_speaker_2_ltr;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.exp);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        String str;
        String str2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        View videoView;
        String str3;
        String str4;
        String str5;
        UrlInfo urlInfo;
        List<String> list;
        UrlInfo urlInfo2;
        List<String> list2;
        final C1885120z9i c1885120z9i = (C1885120z9i) viewHolder;
        if (i < this.LLILLJJLI.size()) {
            Boolean boolLIZIZ = InterfaceC1106030et7.v4.LIZIZ();
            final ItemInfo itemInfo = ((C1885390zA9) ListProtector.get(this.LLILLJJLI, i)).LIZ;
            VideoInfo videoInfo = itemInfo.videoInfo;
            String str6 = "";
            if (videoInfo == null || (urlInfo2 = videoInfo.videoCover) == null || (list2 = urlInfo2.urlList) == null || (str = (String) C13LP.LJJJLL(list2)) == null) {
                str = "";
            }
            ImageView imageView = c1885120z9i.LLILZ;
            if (imageView != null) {
                C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
                url.LJIL = true;
                url.LJJI(imageView);
            }
            CreatorInfo creatorInfo = itemInfo.creatorInfo;
            if (creatorInfo == null || (urlInfo = creatorInfo.icon) == null || (list = urlInfo.urlList) == null || (str2 = (String) C13LP.LJJJLL(list)) == null) {
                str2 = "";
            }
            ImageView imageView2 = c1885120z9i.LLILZLL;
            if (imageView2 != null) {
                C1324610kZf url2 = C1819620xS4.LIZ().setUrl(str2);
                url2.LJIL = true;
                url2.LJJI(imageView2);
            }
            TextView textView = c1885120z9i.LLILZIL;
            if (textView != null) {
                VideoInfo videoInfo2 = itemInfo.videoInfo;
                if (videoInfo2 == null || (str5 = videoInfo2.desc) == null) {
                    str5 = "";
                }
                textView.setText(str5);
            }
            LLLII(c1885120z9i.LLILZIL);
            TextView textView2 = c1885120z9i.LLIZ;
            if (textView2 != null) {
                CreatorInfo creatorInfo2 = itemInfo.creatorInfo;
                if (creatorInfo2 != null && (str4 = creatorInfo2.nickName) != null) {
                    str6 = str4;
                }
                textView2.setText(str6);
            }
            LLLII(c1885120z9i.LLIZ);
            TextView textView3 = c1885120z9i.LLIZLLLIL;
            if (textView3 != null) {
                ItemStatisticsInfo itemStatisticsInfo = itemInfo.statisticsInfo;
                if (itemStatisticsInfo == null || (str3 = itemStatisticsInfo.diggCountFmt) == null) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                textView3.setText(str3);
            }
            LiveIconView liveIconView = c1885120z9i.LLJ;
            if (liveIconView != null) {
                Context context = this.LL;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_like;
                c419910GdJ.LJ = Integer.valueOf(C497740JfY.LIZLLL(R.attr.ezs, this.LL));
                liveIconView.setIcon(c419910GdJ.LIZ(context));
            }
            ViewGroup.LayoutParams layoutParams = c1885120z9i.LL.getLayoutParams();
            if (layoutParams instanceof C21681919tJ) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (i < this.LLILZLL.LJJJJLI() && !C1883500z76.LIZIZ(this.LLILZLL)) {
                iLIZIZ = (int) C497740JfY.LIZIZ(64.0f);
            } else {
                iLIZIZ = 0;
            }
            int iLJJJJLI = this.LLILZLL.LJJJJLI();
            if (i <= iLJJJJLI - 1) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = iLIZIZ;
                }
            } else if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
            }
            if (i % iLJJJJLI == 0) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginEnd(VideoFeedCard.LLLIIIL);
                }
            } else if ((i + 1) % iLJJJJLI == 0) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart(VideoFeedCard.LLLIIIL);
                }
            } else if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(VideoFeedCard.LLLIIIL);
                marginLayoutParams.setMarginStart(VideoFeedCard.LLLIIIL);
            }
            ImageView imageView3 = c1885120z9i.LLILZ;
            if (imageView3 != null) {
                C786410Ut5.Q7(imageView3, new View.OnClickListener() { // from class: X.0zA5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.LL.LLLI(c1885120z9i, i, itemInfo);
                    }
                });
            }
            InterfaceC1885140z9k interfaceC1885140z9k = c1885120z9i.LLILLL;
            if (interfaceC1885140z9k != null && (videoView = interfaceC1885140z9k.getVideoView()) != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0zA6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.LL.LLLI(c1885120z9i, i, itemInfo);
                    }
                }, videoView);
                ViewGroup viewGroup = c1885120z9i.LLILLJJLI;
                if (viewGroup != null) {
                    viewGroup.addView(videoView);
                }
            }
            ImageView imageView4 = c1885120z9i.LLILZ;
            if (imageView4 != null) {
                C500260Jjc.LLFFF(imageView4);
            }
            C500260Jjc.LJIILLIIL(c1885120z9i.LLJIJIL);
            C500260Jjc.LJIILLIIL(c1885120z9i.LLJILJIL);
            InterfaceC1885140z9k interfaceC1885140z9k2 = c1885120z9i.LLILLL;
            if (interfaceC1885140z9k2 != null) {
                interfaceC1885140z9k2.LJIIJ(((C1885390zA9) ListProtector.get(this.LLILLJJLI, i)).LIZIZ);
            }
            InterfaceC1885140z9k interfaceC1885140z9k3 = c1885120z9i.LLILLL;
            if (interfaceC1885140z9k3 != null) {
                Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("index", String.valueOf(i)), new Pair("tab_class", C1883130z6V.LIZ(this.LLILZLL)));
                mapLJIIJ.putAll(LLLFZ());
                interfaceC1885140z9k3.setLogExtras(mapLJIIJ);
            }
            InterfaceC1885140z9k interfaceC1885140z9k4 = c1885120z9i.LLILLL;
            if (interfaceC1885140z9k4 != null) {
                interfaceC1885140z9k4.LIZJ(c1885120z9i.LLJIJIL, c1885120z9i.LLJILJIL);
            }
            InterfaceC1885140z9k interfaceC1885140z9k5 = c1885120z9i.LLILLL;
            if (interfaceC1885140z9k5 != null) {
                interfaceC1885140z9k5.LIZ(boolLIZIZ.booleanValue());
            }
            LLLIIIIL(c1885120z9i.LLJIJIL, boolLIZIZ.booleanValue());
            TuxIconView tuxIconView = c1885120z9i.LLJIJIL;
            if (tuxIconView != null) {
                C500260Jjc.LJIILLIIL(tuxIconView);
            }
            TuxIconView tuxIconView2 = c1885120z9i.LLJIJIL;
            if (tuxIconView2 != null) {
                C786410Ut5.a9(tuxIconView2, new View.OnClickListener() { // from class: X.0z9j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z;
                        InterfaceC1885140z9k interfaceC1885140z9k6 = c1885120z9i.LLILLL;
                        if (interfaceC1885140z9k6 != null && interfaceC1885140z9k6.isMute()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z2 = !z;
                        InterfaceC1106030et7.v4.LJFF(Boolean.valueOf(z2));
                        InterfaceC1885140z9k interfaceC1885140z9k7 = c1885120z9i.LLILLL;
                        if (interfaceC1885140z9k7 != null) {
                            interfaceC1885140z9k7.LIZ(z2);
                        }
                        C1885150z9l c1885150z9l = this;
                        TuxIconView tuxIconView3 = c1885120z9i.LLJIJIL;
                        c1885150z9l.getClass();
                        C1885150z9l.LLLIIIIL(tuxIconView3, z2);
                    }
                });
                return;
            }
            return;
        }
        if (this.LLILZ) {
            View view = c1885120z9i.LLJI;
            if (view == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        View view2 = c1885120z9i.LLJI;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, view2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(1:4)(1:21)|5|(3:7|(2:9|(1:11))(1:18)|12)(13:(0)|14|(1:16)|17|46|22|(1:24)|27|42|28|(3:44|30|(3:32|35|(1:37)))|40|41)|13|14|(0)|17|46|22|(0)|27|42|28|(0)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C2081408Dk.LIZ(r0);
        X.C2344809Gs.LIZ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #2 {all -> 0x005a, blocks: (B:22:0x004b, B:24:0x004f), top: B:46:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r7, int r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1885150z9l.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLI(X.C1885120z9i r18, int r19, com.bytedance.android.livesdk.game.model.ItemInfo r20) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1885150z9l.LLLI(X.0z9i, int, com.bytedance.android.livesdk.game.model.ItemInfo):void");
    }

    public C1885150z9l(VideoFeedCard videoFeedCard, Context context, List<C1885390zA9> list, int i) {
        this.LLILZLL = videoFeedCard;
        this.LL = context;
        this.LLILLJJLI = list;
        this.LLILLL = i;
    }
}
