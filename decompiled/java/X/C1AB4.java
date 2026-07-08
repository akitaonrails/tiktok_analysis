package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS78S0100100_33;

/* JADX INFO: renamed from: X.1AB4, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AB4 extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ LabelContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AB4(LabelContainerWidget labelContainerWidget) {
        super(1);
        this.LL = labelContainerWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        boolean z;
        LiveRoomStruct liveRoomStruct;
        C1ABV c1abv;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1aca;
        LiveRoomStruct liveRoomStruct3;
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct4;
        C1ACA c1acaZ12;
        LiveRoomStruct liveRoomStruct5;
        LiveRoomStruct liveRoomStruct6;
        LabelContainerWidget labelContainerWidget = this.LL;
        labelContainerWidget.getClass();
        if (C0IU0.LJFF) {
            C0IU0.LJFF = false;
            C0IU1 c0iu1 = C0IU0.LJ;
            if (c0iu1 != null && (c1acaZ1 = labelContainerWidget.z1()) != null && (liveRoomStruct4 = c1acaZ1.LIZJ) != null && c0iu1.LIZIZ == liveRoomStruct4.id) {
                C1ACA c1acaZ13 = labelContainerWidget.z1();
                if (c1acaZ13 != null && (liveRoomStruct6 = c1acaZ13.LIZJ) != null) {
                    liveRoomStruct6.allowPreviewTime = c0iu1.LIZ;
                }
                if (c0iu1.LIZJ > 0 && (c1acaZ12 = labelContainerWidget.z1()) != null && (liveRoomStruct5 = c1acaZ12.LIZJ) != null) {
                    liveRoomStruct5.liveSubOnly = 1L;
                }
            }
            z = true;
        } else {
            z = false;
        }
        C1ACA c1acaZ14 = this.LL.z1();
        if (c1acaZ14 != null && (liveRoomStruct = c1acaZ14.LIZJ) != null) {
            LabelContainerWidget labelContainerWidget2 = this.LL;
            LivePreviewPlayerVM livePreviewPlayerVMS1 = labelContainerWidget2.S1();
            if (livePreviewPlayerVMS1 != null) {
                c1abv = livePreviewPlayerVMS1.LLJJJJLIIL;
            } else {
                c1abv = null;
            }
            if (c1abv == C1ABV.STOP || z) {
                long j = liveRoomStruct.allowPreviewTime;
                SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) labelContainerWidget2.LLJJJ.getValue();
                if (subscribeMaskLayerVM != null && (c1aca = (C1ACA) subscribeMaskLayerVM.LL.getValue()) != null && (liveRoomStruct3 = c1aca.LIZJ) != null) {
                    long j2 = liveRoomStruct3.allowPreviewTime;
                    if (j2 > 0) {
                        subscribeMaskLayerVM.LLILZ = j2;
                    }
                }
                if (j > 0) {
                    LivePreviewPlayerVM livePreviewPlayerVMS12 = labelContainerWidget2.S1();
                    if (livePreviewPlayerVMS12 != null) {
                        livePreviewPlayerVMS12.LLJJJJLIIL = C1ABV.SHOW;
                    }
                    C1AB2 c1ab2 = labelContainerWidget2.LLJJLIIIJLLLLLLLZ;
                    if (c1ab2 != null) {
                        c1ab2.cancel();
                    }
                    C1AB2 c1ab2N1 = labelContainerWidget2.N1(j);
                    labelContainerWidget2.LLJJLIIIJLLLLLLLZ = c1ab2N1;
                    c1ab2N1.start();
                } else if (j == 0) {
                    C1ACA c1acaZ15 = labelContainerWidget2.z1();
                    if (c1acaZ15 != null && (liveRoomStruct2 = c1acaZ15.LIZJ) != null && liveRoomStruct2.liveSubOnly == 1) {
                        LivePreviewPlayerVM livePreviewPlayerVMS13 = labelContainerWidget2.S1();
                        if (livePreviewPlayerVMS13 != null) {
                            livePreviewPlayerVMS13.LLJJJJLIIL = C1ABV.SHOW;
                        }
                        C1AB2 c1ab22 = labelContainerWidget2.LLJJLIIIJLLLLLLLZ;
                        if (c1ab22 != null) {
                            c1ab22.cancel();
                        }
                        LivePreviewPlayerVM livePreviewPlayerVMS14 = labelContainerWidget2.S1();
                        if (livePreviewPlayerVMS14 != null) {
                            livePreviewPlayerVMS14.wQ2(new AwS78S0100100_33(j, labelContainerWidget2, 0), false);
                        }
                    }
                } else {
                    C1AB2 c1ab23 = labelContainerWidget2.LLJJLIIIJLLLLLLLZ;
                    if (c1ab23 != null) {
                        c1ab23.cancel();
                    }
                }
                labelContainerWidget2.k2();
            }
            labelContainerWidget2.i2();
        }
        return Unit.LIZ;
    }
}
