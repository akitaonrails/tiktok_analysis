package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS27S1200000_23;
import Y.ARunnableS28S1100000_23;
import Y.ARunnableS42S0110000_23;
import Y.ARunnableS8S0100001_23;
import Y.ARunnableS92S0200000_23;
import android.view.Surface;
import android.view.SurfaceControl;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0ok7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484850ok7 implements InterfaceC1484830ok5 {
    public final InterfaceC1484830ok5 LIZ;

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJFF(C1484040oio c1484040oio) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJII(SurfaceControl surfaceControl, int i, int i2) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJIIZILJ(InterfaceC1482530ogN interfaceC1482530ogN) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ List LJIJJ() {
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJ() {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int LJJI() {
        return 0;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ boolean LJJIFFI() {
        return false;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIIJ(EnumC1490990ou1 enumC1490990ou1) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIIJZLJL(long j, Surface surface, boolean z) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIIZ(InterfaceC1482530ogN interfaceC1482530ogN) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIJIL(String str, String str2) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIL(String str) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJI(InterfaceC1483670oiD interfaceC1483670oiD) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int LJJJJIZL(int i) {
        return 0;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJJL(boolean z) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJJLI(String str, boolean z) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJJLL() {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int LJJJJZ(C1699290uJz c1699290uJz, C1699370uK7 c1699370uK7) {
        return 0;
    }

    @Override // X.InterfaceC1483520ohy
    public final /* synthetic */ InterfaceC1483510ohx LJJJJZI() {
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJLL(long j, C1699310uK1 c1699310uK1, ExecutorService executorService, boolean z) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJL(C1699080uJe c1699080uJe) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int LJJLIIIIJ(int i, byte[] bArr) {
        return 0;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJLIIIJLLLLLLLZ(Surface surface) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ InterfaceC1699280uJy LJJLIIJ() {
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJLJ() {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int getAudioDuckingDurationForLive(int i) {
        return 0;
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483420oho LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1488100opM LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483670oiD LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC650720Pfi getLegacy() {
        return this.LIZ.getLegacy();
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483850oiV getPlayState() {
        return this.LIZ.getPlayState();
    }

    @Override // X.InterfaceC1484830ok5
    public final void pause() {
        C0C83.INS.runOnMsg(new ARunnableS123S0100000_23(this, 172));
    }

    @Override // X.InterfaceC1484830ok5
    public final void release() {
        C0C83.INS.runOnMsg(new ARunnableS123S0100000_23(this, 175));
    }

    @Override // X.InterfaceC1484830ok5
    public final void reset() {
        C0C83.INS.runOnMsg(new ARunnableS123S0100000_23(this, 176));
    }

    @Override // X.InterfaceC1484830ok5
    public final void resume() {
        C0C83.INS.runOnMsg(new ARunnableS123S0100000_23(this, 173));
    }

    @Override // X.InterfaceC1484830ok5
    public final void stop() {
        C0C83.INS.runOnMsg(new ARunnableS123S0100000_23(this, 174));
    }

    public C1484850ok7(AbstractC1483760oiM abstractC1483760oiM) {
        this.LIZ = abstractC1483760oiM;
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZ(boolean z) {
        C0C83.INS.runOnMsg(new ARunnableS42S0110000_23(this, z, 10));
    }

    @Override // X.InterfaceC1484830ok5
    public final Object LIZIZ(AbstractC586270Mz3 abstractC586270Mz3) {
        return abstractC586270Mz3.LIZ();
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
        C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(interfaceC1483820oiS, this, 120));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
        C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(interfaceC1483820oiS, this, 121));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(interfaceC1479620obg, this, 124));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
        C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(interfaceC1483820oiS, this, 122));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIILLIIL(InterfaceC1482530ogN interfaceC1482530ogN) {
        C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(interfaceC1482530ogN, this, 117));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJII(String str) {
        C0C83.INS.runOnMsg(new ARunnableS28S1100000_23(this, str, 35));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJIIZI(InterfaceC1481870ofJ interfaceC1481870ofJ) {
        C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(interfaceC1481870ofJ, this, 118));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJJIL(InterfaceC1479620obg interfaceC1479620obg) {
        C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(interfaceC1479620obg, this, 116));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJJLIIL(InterfaceC1472880oQo interfaceC1472880oQo) {
        C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(interfaceC1472880oQo, this, 123));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJLIIIJL(InterfaceC585470Mxl interfaceC585470Mxl) {
        C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(interfaceC585470Mxl, this, 119));
    }

    @Override // X.InterfaceC1484830ok5
    public final void seek(float f) {
        C0C83.INS.runOnMsg(new ARunnableS8S0100001_23(this, f, 1));
    }

    @Override // X.InterfaceC1484830ok5
    public final void setLoop(boolean z) {
        C0C83.INS.runOnMsg(new ARunnableS42S0110000_23(this, z, 11));
    }

    @Override // X.InterfaceC1484830ok5
    public final void setSpeed(float f) {
        C0C83.INS.runOnMsg(new ARunnableS8S0100001_23(this, f, 2));
    }

    @Override // X.InterfaceC1484830ok5
    public final void stop(String str) {
        C0C83.INS.runOnMsg(new ARunnableS28S1100000_23(this, str, 36));
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIIIIZZ(String str, List<InterfaceC1479620obg> list) {
        C0C83.INS.runOnMsg(new ARunnableS27S1200000_23(list, this, str, 15));
    }
}
