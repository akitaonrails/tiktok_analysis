package X;

import Y.ACListenerS135S0200000_33;
import Y.ARunnableS15S1300000_17;
import Y.ARunnableS20S0500000_32;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS242S0300000_33;
import kotlin.jvm.internal.AwS54S0301000_32;
import kotlin.text.a0;
import kotlin.text.u;
import webcast.data.AnchorGrowRewardInfo;
import webcast.data.AnchorGrowTaskListItem;
import webcast.data.AnchorTaskGuideInfo;
import webcast.data.AnchorTaskGuideInfoItem;
import webcast.data.AnchorTaskProgress;
import webcast.data.AnchorTaskRewardInfo;

/* JADX INFO: renamed from: X.1AGW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AGW extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final DataChannel LL;
    public final List<C2176651AGp> LLILLJJLI = new ArrayList();

    public final List<C2176651AGp> LLLFZ() {
        return new ArrayList(this.LLILLJJLI);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) LLLFZ()).size();
    }

    public C1AGW(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void LLLI(List<C2176651AGp> list) {
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((ArrayList) LLLFZ()).size() <= i) {
            return 0;
        }
        Object obj = ListProtector.get(LLLFZ(), i);
        if (obj instanceof C2176601AGk) {
            return 1;
        }
        if (obj instanceof C2176581AGi) {
            return 2;
        }
        if (obj instanceof C2176531AGd) {
            return 3;
        }
        if (obj instanceof C2176541AGe) {
            return 4;
        }
        if (!(obj instanceof C2176641AGo)) {
            return 0;
        }
        return 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strLJIJI;
        Object objValueOf;
        Integer numValueOf;
        String idStr;
        Room room;
        Object objValueOf2;
        String idStr2;
        Room room2;
        Integer numValueOf2;
        C20743516Fd c20743516FdLIZLLL;
        T imageSpan;
        AnchorTaskGuideInfo anchorTaskGuideInfo;
        AnchorTaskGuideInfoItem anchorTaskGuideInfoItem;
        String str;
        Integer numValueOf3;
        String strLJIJI2;
        String strJ4;
        long j;
        String str2;
        String str3;
        C2176651AGp c2176651AGp = (C2176651AGp) ListProtector.get(LLLFZ(), i);
        Long lValueOf = null;
        if ((viewHolder instanceof C2176501AGa) && (c2176651AGp instanceof C2176601AGk)) {
            C2176501AGa c2176501AGa = (C2176501AGa) viewHolder;
            C2176601AGk c2176601AGk = (C2176601AGk) c2176651AGp;
            c2176501AGa.getClass();
            int i2 = c2176601AGk.LIZ;
            if (i2 != 0) {
                c2176501AGa.itemView.setPadding(0, i2, 0, 0);
            } else {
                c2176501AGa.itemView.setPadding(0, 0, 0, 0);
            }
            AnchorGrowTaskListItem anchorGrowTaskListItem = c2176601AGk.LIZLLL;
            if (anchorGrowTaskListItem != null) {
                if (anchorGrowTaskListItem.taskStatus == 3) {
                    c2176501AGa.LLILLJJLI.setText(C497740JfY.LJIJI(2131851083));
                } else {
                    AnchorGrowRewardInfo anchorGrowRewardInfo = anchorGrowTaskListItem.taskRewardInfo;
                    if (anchorGrowRewardInfo != null && anchorGrowRewardInfo.type > 0) {
                        String strLJIJI3 = C497740JfY.LJIJI(2131851082);
                        C16F5 c16f5 = c2176501AGa.LLILLJJLI;
                        AnchorGrowRewardInfo anchorGrowRewardInfo2 = anchorGrowTaskListItem.taskRewardInfo;
                        if (anchorGrowRewardInfo2 == null || (str2 = anchorGrowRewardInfo2.lowercaseTitle) == null) {
                            str2 = "flares";
                        }
                        c16f5.setText(u.LJJIFFI(strLJIJI3, "{rewards}", str2, false));
                    } else {
                        c2176501AGa.LLILLJJLI.setText(C497740JfY.LJIJI(2131851081));
                    }
                }
                AnchorGrowRewardInfo anchorGrowRewardInfo3 = anchorGrowTaskListItem.taskRewardInfo;
                if (anchorGrowRewardInfo3 != null && anchorGrowRewardInfo3.type > 0) {
                    C500260Jjc.LLFFF(c2176501AGa.LLILZIL);
                    C500260Jjc.LLFFF(c2176501AGa.LLILZ);
                    AnchorGrowRewardInfo anchorGrowRewardInfo4 = anchorGrowTaskListItem.taskRewardInfo;
                    if (anchorGrowRewardInfo4 != null) {
                        str3 = anchorGrowRewardInfo4.icon;
                    } else {
                        str3 = null;
                    }
                    C1819620xS4.LIZ().setUrl(str3).LJJI(c2176501AGa.LLILZIL);
                    C16F5 c16f52 = c2176501AGa.LLILZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('x');
                    AnchorGrowRewardInfo anchorGrowRewardInfo5 = anchorGrowTaskListItem.taskRewardInfo;
                    if (anchorGrowRewardInfo5 != null) {
                        lValueOf = Long.valueOf(anchorGrowRewardInfo5.num);
                    }
                    sbLIZ.append(lValueOf);
                    c16f52.setText(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    C500260Jjc.LJIILIIL(c2176501AGa.LLILZIL);
                    C500260Jjc.LJIILIIL(c2176501AGa.LLILZ);
                }
            }
            C2176561AGg.LJI = C497740JfY.LJIJI(2131851078);
            C16F5 c16f53 = c2176501AGa.LLILLL;
            AnchorGrowTaskListItem anchorGrowTaskListItem2 = c2176601AGk.LIZLLL;
            if (anchorGrowTaskListItem2 != null) {
                j = anchorGrowTaskListItem2.taskExpireTime;
            } else {
                j = 0;
            }
            c16f53.setText(C2176561AGg.LIZ(j));
            c2176501AGa.LLILZLL = c2176601AGk;
            return;
        }
        if ((viewHolder instanceof C2176521AGc) && (c2176651AGp instanceof C2176581AGi)) {
            C2176521AGc c2176521AGc = (C2176521AGc) viewHolder;
            C2176581AGi c2176581AGi = (C2176581AGi) c2176651AGp;
            c2176521AGc.getClass();
            int i3 = c2176581AGi.LIZ;
            if (i3 != 0) {
                c2176521AGc.itemView.setPadding(0, i3, 0, 0);
            } else {
                c2176521AGc.itemView.setPadding(0, 0, 0, 0);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c2176581AGi.LIZJ);
            sbLIZ2.append('/');
            sbLIZ2.append(c2176581AGi.LIZLLL);
            spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ2));
            int iLJJJ = a0.LJJJ(spannableStringBuilder, "/", 0, false, 6);
            if (iLJJJ > 0 && iLJJJ < spannableStringBuilder.length()) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9k, c2176521AGc.itemView.getContext())), 0, iLJJJ, 17);
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9l, c2176521AGc.itemView.getContext())), iLJJJ, spannableStringBuilder.length(), 18);
            }
            c2176521AGc.LLILZIL.setText(spannableStringBuilder);
            c2176521AGc.LLILZ.setMax(c2176581AGi.LIZLLL);
            c2176521AGc.LLILZ.setProgress(c2176581AGi.LIZJ);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (c2176581AGi.LJ) {
                strLJIJI2 = C497740JfY.LJIJI(2131842063);
            } else {
                strLJIJI2 = C497740JfY.LJIJI(2131842064);
            }
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = a0.LJJJ(strLJIJI2, "%@", 0, false, 6);
            spannableStringBuilder2.append((CharSequence) strLJIJI2);
            int i4 = c118300cf.element;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((char) 65532);
            spannableStringBuilder2.replace(i4, i4 + 2, (CharSequence) spannableStringBuilder3);
            int i5 = c2176581AGi.LIZLLL - c2176581AGi.LIZJ;
            int i6 = c2176581AGi.LJFF;
            if (!c2176581AGi.LJ) {
                strJ4 = C786410Ut5.j4(spannableStringBuilder2.toString(), Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
            } else {
                strJ4 = C786410Ut5.j4(spannableStringBuilder2.toString(), Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6 + 1)}, 2));
            }
            spannableStringBuilder2.clear();
            spannableStringBuilder2.append((CharSequence) strJ4);
            c2176521AGc.LL.setText(spannableStringBuilder2);
            C823050WQl.LIZIZ().submit(new ARunnableS15S1300000_17(strLJIJI2, c118300cf, spannableStringBuilder2, c2176521AGc, 0));
            if (c2176581AGi.LJI.size() > 0) {
                C500260Jjc.LLFFF(c2176521AGc.LLILLJJLI);
                C500260Jjc.LLFFF(c2176521AGc.LLILLL);
                C1819620xS4.LIZ().setUrl(((AnchorGrowRewardInfo) ListProtector.get(c2176581AGi.LJI, 0)).icon).LJJI(c2176521AGc.LLILLJJLI);
                StringBuilder sb = new StringBuilder();
                sb.append("x");
                sb.append(((AnchorGrowRewardInfo) ListProtector.get(c2176581AGi.LJI, 0)).num);
                c2176521AGc.LLILLL.setText(sb);
                return;
            }
            C500260Jjc.LJIILIIL(c2176521AGc.LLILLJJLI);
            C500260Jjc.LJIILIIL(c2176521AGc.LLILLL);
            return;
        }
        if ((viewHolder instanceof C19KU) && (c2176651AGp instanceof C2176531AGd)) {
            final C19KU c19ku = (C19KU) viewHolder;
            C2176531AGd c2176531AGd = (C2176531AGd) c2176651AGp;
            c19ku.getClass();
            final AnchorTaskProgress anchorTaskProgress = c2176531AGd.LJII;
            if (anchorTaskProgress != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(anchorTaskProgress.taskTargetDes);
                sbLIZ3.append("  ");
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ3));
                if (c2176531AGd.LJIIIZ == EnumC1781600wSk.INSTANCE_TASK_TYPE) {
                    c19ku.I5(spannableStringBuilder4, anchorTaskProgress, spannableStringBuilder4.length());
                    c19ku.LLILLJJLI.setText(spannableStringBuilder4);
                    c19ku.LLILLJJLI.setTextColor(C20736316Cj.LIZIZ(R.attr.c9j, c19ku.LLIZLLLIL));
                } else {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(spannableStringBuilder4);
                    c19ku.I5(spannableStringBuilder5, anchorTaskProgress, spannableStringBuilder4.length());
                    c19ku.LLILLJJLI.setText(spannableStringBuilder5);
                    int length = spannableStringBuilder4.length();
                    C259800zU c259800zU = new C259800zU();
                    if (anchorTaskProgress.subTargetDes.length() > 0 && 1 != 0 && (c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dw4, c19ku.LLIZLLLIL)) != null) {
                        C16GF.LJI(c20743516FdLIZLLL, C20736316Cj.LIZIZ(R.attr.c9k, c19ku.LLIZLLLIL));
                        int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
                        c20743516FdLIZLLL.setBounds(0, 0, iLIZIZ, iLIZIZ);
                        if (Build.VERSION.SDK_INT >= 29) {
                            imageSpan = new ImageSpan(c20743516FdLIZLLL, 2);
                        } else {
                            imageSpan = new ImageSpan(c20743516FdLIZLLL);
                        }
                        c259800zU.element = imageSpan;
                        C786410Ut5.q2(spannableStringBuilder4, imageSpan, spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 17);
                        C786410Ut5.q2(spannableStringBuilder4, new ClickableSpan() { // from class: X.1AHL
                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                LifecycleOwner lifecycleOwner;
                                C19KU c19ku2 = c19ku;
                                String str4 = anchorTaskProgress.subTargetDes;
                                c19ku2.getClass();
                                C782110Um9 c782110Um9 = new C782110Um9(c19ku2.LLIZLLLIL);
                                c782110Um9.LJIIIZ(str4);
                                c782110Um9.LJIIL(2131842050);
                                DataChannel dataChannel = c19ku2.LL;
                                if (dataChannel != null) {
                                    lifecycleOwner = dataChannel.LLILZ;
                                } else {
                                    lifecycleOwner = null;
                                }
                                c782110Um9.LIZIZ = lifecycleOwner;
                                c782110Um9.LJIILLIIL = false;
                                c782110Um9.LJIILL = false;
                                C786410Ut5.E4(c782110Um9.LIZ());
                            }
                        }, spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 17);
                        spannableStringBuilder4.append((CharSequence) "  ");
                    }
                    AnchorTaskRewardInfo anchorTaskRewardInfo = c2176531AGd.LJIIIIZZ;
                    if (anchorTaskRewardInfo != null) {
                        numValueOf2 = Integer.valueOf(anchorTaskRewardInfo.rewardCount);
                    } else {
                        numValueOf2 = null;
                    }
                    String strValueOf = String.valueOf(numValueOf2);
                    LinearLayout linearLayout = new LinearLayout(c19ku.LLIZLLLIL);
                    C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
                    linearLayout.setOrientation(0);
                    linearLayout.setBackground(C800330VaR.LIZIZ(linearLayout.getContext(), R.drawable.dx8));
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(2.0f);
                    linearLayout.setPadding(iLIZIZ2, 0, iLIZIZ2, 0);
                    linearLayout.setGravity(16);
                    C16F5 c16f54 = new C16F5(c19ku.LLIZLLLIL, null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(0, 0, (int) C497740JfY.LIZIZ(1.5f), (int) C497740JfY.LIZIZ(0.5f));
                    C786410Ut5.y6(c16f54, layoutParams);
                    c16f54.setTextColor(C20736316Cj.LIZIZ(R.attr.c9k, c16f54.getContext()));
                    c16f54.setText(strValueOf);
                    c16f54.setGravity(17);
                    c16f54.LJJJI(R.style.a9p);
                    c16f54.setTextSize(2, 12.0f);
                    C16FV c16fv = new C16FV(c19ku.LLIZLLLIL);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) C497740JfY.LIZIZ(13.0f), (int) C497740JfY.LIZIZ(13.0f));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fv);
                    c16fv.setLayoutParams(layoutParams2);
                    c16fv.setScaleType(ImageView.ScaleType.FIT_XY);
                    c16fv.setTag(linearLayout.toString());
                    linearLayout.addView(c16f54);
                    linearLayout.addView(c16fv);
                    C823050WQl.LIZIZ().submit(new ARunnableS20S0500000_32(linearLayout, c19ku, spannableStringBuilder4, anchorTaskProgress, new AwS54S0301000_32(c19ku, spannableStringBuilder4, c259800zU, length, 0), 0));
                }
                if (anchorTaskProgress.taskTargetFinished == anchorTaskProgress.taskTargetValue && c2176531AGd.LJIIIZ == EnumC1781600wSk.GROWTH_TASK_TYPE) {
                    C786410Ut5.LLJJJJJIL(c19ku.LLILLL, 0);
                    C786410Ut5.LLJJJJ(c19ku.LLILZ, 0);
                    C786410Ut5.LLJJJJJIL(c19ku.LLILZIL, 0);
                    C786410Ut5.LLJJJ(c19ku.LLILZLL, 8);
                    C1143680frq.LJI(c19ku.LLILZIL, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_5", "ttlive_coin_icon.png"), null, true);
                    C16F5 c16f55 = c19ku.LLILZ;
                    AnchorTaskRewardInfo anchorTaskRewardInfo2 = c2176531AGd.LJIIIIZZ;
                    if (anchorTaskRewardInfo2 != null) {
                        numValueOf3 = Integer.valueOf(anchorTaskRewardInfo2.rewardCount);
                    } else {
                        numValueOf3 = null;
                    }
                    c16f55.setText(String.valueOf(numValueOf3));
                    C1143680frq.LJI(c19ku.LLILLL, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_5", "ttlive_tick_tiny_fill.png"), null, true);
                    c19ku.LLILZ.setTextColor(C20736316Cj.LIZIZ(R.attr.c9i, c19ku.LLIZLLLIL));
                } else {
                    C786410Ut5.LLJJJJJIL(c19ku.LLILLL, 8);
                    C786410Ut5.LLJJJJ(c19ku.LLILZ, 8);
                    C786410Ut5.LLJJJJJIL(c19ku.LLILZIL, 8);
                }
                if (anchorTaskProgress.taskTargetFinished != anchorTaskProgress.taskTargetValue && (anchorTaskGuideInfo = anchorTaskProgress.taskGuideInfo) != null && anchorTaskGuideInfo.guideInRoom != null) {
                    C786410Ut5.LLJJJ(c19ku.LLILZLL, 0);
                    AnchorTaskGuideInfo anchorTaskGuideInfo2 = anchorTaskProgress.taskGuideInfo;
                    if (anchorTaskGuideInfo2 != null && (anchorTaskGuideInfoItem = anchorTaskGuideInfo2.guideInRoom) != null && (str = anchorTaskGuideInfoItem.buttonText) != null) {
                        c19ku.LLILZLL.setText(str);
                    }
                    C500260Jjc.LJLIIIL(500L, c19ku.LLILZLL, new AwS242S0300000_33(c19ku, anchorTaskProgress, c2176531AGd, 7));
                    C1AGX.LIZIZ(c19ku.LL, c2176531AGd, false);
                } else {
                    C786410Ut5.LLJJJ(c19ku.LLILZLL, 8);
                }
                if (c19ku.LLILZLL.getVisibility() != 0 && c19ku.LLILZ.getVisibility() != 0) {
                    C786410Ut5.LL(8, c19ku.LLIZ);
                } else {
                    C786410Ut5.LL(0, c19ku.LLIZ);
                }
            }
            EnumC1781600wSk enumC1781600wSk = c2176531AGd.LJIIIZ;
            String str4 = "finished";
            String str5 = "";
            float f = 0.0f;
            if (enumC1781600wSk == EnumC1781600wSk.INSTANCE_TASK_TYPE) {
                DataChannel dataChannel = c19ku.LL;
                AnchorTaskProgress anchorTaskProgress2 = c2176531AGd.LJII;
                if (anchorTaskProgress2 != null) {
                    float f2 = anchorTaskProgress2.taskTargetFinished;
                    float f3 = anchorTaskProgress2.taskTargetValue;
                    if (f3 > 0.0f && f2 >= 0.0f) {
                        f = f2 / f3;
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_time_limited_tasks_task_show");
                c474500IjALIZ.LJIJJLI(dataChannel);
                if (dataChannel == null || (room2 = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
                    objValueOf2 = "";
                } else {
                    objValueOf2 = Long.valueOf(room2.getOwnerUserId());
                }
                c474500IjALIZ.LJJII(objValueOf2, "anchor_id");
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
                if (roomLJJLIIIIJ != null && (idStr2 = roomLJJLIIIIJ.getIdStr()) != null) {
                    str5 = idStr2;
                }
                c474500IjALIZ.LJJII(str5, "room_id");
                c474500IjALIZ.LJJII("realtime_live_center", "event_page");
                c474500IjALIZ.LJJII(Long.valueOf(c2176531AGd.LJFF), "task_id");
                if (c2176531AGd.LJI != 3) {
                    str4 = "in_progress";
                }
                c474500IjALIZ.LJJII(str4, "task_status");
                c474500IjALIZ.LJJIFFI(Float.valueOf(f), "task_progress");
                c474500IjALIZ.LIZ();
                return;
            }
            if (enumC1781600wSk != EnumC1781600wSk.GROWTH_TASK_TYPE) {
                return;
            }
            DataChannel dataChannel2 = c19ku.LL;
            AnchorTaskProgress anchorTaskProgress3 = c2176531AGd.LJII;
            if (anchorTaskProgress3 != null) {
                float f4 = anchorTaskProgress3.taskTargetFinished;
                float f5 = anchorTaskProgress3.taskTargetValue;
                if (f5 > 0.0f && f4 >= 0.0f) {
                    f = f4 / f5;
                }
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_growthjourney_task_show");
            c474500IjALIZ2.LJIJJLI(dataChannel2);
            if (dataChannel2 == null || (room = (Room) dataChannel2.gg0(RoomChannel.class)) == null) {
                objValueOf = "";
            } else {
                objValueOf = Long.valueOf(room.getOwnerUserId());
            }
            c474500IjALIZ2.LJJII(objValueOf, "anchor_id");
            c474500IjALIZ2.LJJII(Integer.valueOf(c2176531AGd.LJ), "growth_stage");
            Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel2);
            if (roomLJJLIIIIJ2 != null && (idStr = roomLJJLIIIIJ2.getIdStr()) != null) {
                str5 = idStr;
            }
            c474500IjALIZ2.LJJII(str5, "room_id");
            c474500IjALIZ2.LJJII("realtime_live_center", "event_page");
            c474500IjALIZ2.LJJII(Long.valueOf(c2176531AGd.LJFF), "task_id");
            if (c2176531AGd.LJI != 3) {
                str4 = "in_progress";
            }
            c474500IjALIZ2.LJJII(str4, "task_status");
            c474500IjALIZ2.LJJIFFI(Float.valueOf(f), "task_progress");
            AnchorTaskRewardInfo anchorTaskRewardInfo3 = c2176531AGd.LJIIIIZZ;
            if (anchorTaskRewardInfo3 != null) {
                numValueOf = Integer.valueOf(anchorTaskRewardInfo3.rewardCount);
            } else {
                numValueOf = null;
            }
            c474500IjALIZ2.LJJII(String.valueOf(numValueOf), "points_num");
            c474500IjALIZ2.LIZ();
            return;
        }
        if (!(viewHolder instanceof C2176511AGb) || !(c2176651AGp instanceof C2176541AGe)) {
            return;
        }
        C2176511AGb c2176511AGb = (C2176511AGb) viewHolder;
        C2176541AGe c2176541AGe = (C2176541AGe) c2176651AGp;
        if (i == getItemCount() - 1) {
            c2176511AGb.itemView.setPadding(0, 0, 0, 0);
        } else {
            c2176511AGb.itemView.setPadding(0, 0, 0, c2176541AGe.LIZIZ);
        }
        AnchorGrowRewardInfo anchorGrowRewardInfo6 = c2176541AGe.LIZLLL;
        if (anchorGrowRewardInfo6 != null) {
            C1819620xS4.LIZ().setUrl(anchorGrowRewardInfo6.icon).LJJI(c2176511AGb.LLILLJJLI);
            if (c2176541AGe.LJIIIIZZ == EnumC1781600wSk.GROWTH_TASK_TYPE) {
                c2176511AGb.LLILLL.setText(u.LJJIFFI(C497740JfY.LJIJI(2131842067), "{num}", String.valueOf(c2176541AGe.LIZJ), false));
            } else {
                C16F5 c16f56 = c2176511AGb.LLILLL;
                AnchorGrowRewardInfo anchorGrowRewardInfo7 = c2176541AGe.LIZLLL;
                if (anchorGrowRewardInfo7 == null || (strLJIJI = anchorGrowRewardInfo7.desc) == null) {
                    strLJIJI = C497740JfY.LJIJI(2131851079);
                }
                c16f56.setText(strLJIJI);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("x");
            sb2.append(anchorGrowRewardInfo6.num);
            c2176511AGb.LLILZ.setText(sb2);
            if (!c2176541AGe.LJIIIZ) {
                c2176511AGb.LLILZIL.setEnabled(true);
                c2176511AGb.LLILZIL.setText(C497740JfY.LJIJI(2131842068));
            }
            C786410Ut5.h8(c2176511AGb.LLILZIL, new ACListenerS135S0200000_33(c2176511AGb, c2176541AGe, 10));
        }
        C1AGX.LIZ(c2176511AGb.LL, c2176541AGe, false, 1);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c2176521AGc;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            final View view = new View(viewGroup.getContext());
                            c2176521AGc = new RecyclerView.ViewHolder(view) { // from class: X.1AGm
                            };
                        } else {
                            View view2 = new View(viewGroup.getContext());
                            C786410Ut5.W5(view2, new FrameLayout.LayoutParams(-1, (int) C497740JfY.LIZIZ(0.5f)));
                            view2.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.cdh, view2.getContext()));
                            final FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                            int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
                            layoutParams.setMargins(iLIZIZ, 0, iLIZIZ, iLIZIZ * 2);
                            C786410Ut5.a6(frameLayout, layoutParams);
                            frameLayout.addView(view2);
                            c2176521AGc = new RecyclerView.ViewHolder(frameLayout) { // from class: X.1AGl
                            };
                        }
                    } else {
                        c2176521AGc = new C2176511AGb(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h0u, viewGroup, false), this.LL);
                    }
                } else {
                    c2176521AGc = new C19KU(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h16, viewGroup, false), this.LL);
                }
            } else {
                c2176521AGc = new C2176521AGc(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h0m, viewGroup, false));
            }
        } else {
            C2176501AGa c2176501AGa = new C2176501AGa(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h0n, viewGroup, false), this.LL);
            ((ArrayList) C2176561AGg.LIZIZ).add(new C1AGZ(c2176501AGa));
            c2176521AGc = c2176501AGa;
        }
        try {
            View view3 = c2176521AGc.itemView;
            if (view3 != null) {
                view3.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c2176521AGc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c2176521AGc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c2176521AGc.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c2176521AGc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c2176521AGc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c2176521AGc.getClass().getName();
        return c2176521AGc;
    }
}
