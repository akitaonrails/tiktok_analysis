package com.bef.effectsdk.algorithm;

/* JADX INFO: loaded from: classes31.dex */
public class RectDocDetResult {
    public RectDocDetRatio rectDocDetRatio;
    public RectDocDetTargetArea rectDocDetTargetArea;
    public int resultStatus;

    public RectDocDetResult() {
        this.resultStatus = -1;
    }

    public RectDocDetRatio getRectDocDetRatio() {
        return this.rectDocDetRatio;
    }

    public RectDocDetTargetArea getRectDocDetTargetArea() {
        return this.rectDocDetTargetArea;
    }

    public int getResultStatus() {
        return this.resultStatus;
    }

    public RectDocDetResult(RectDocDetTargetArea rectDocDetTargetArea, RectDocDetRatio rectDocDetRatio) {
        this.rectDocDetTargetArea = rectDocDetTargetArea;
        this.rectDocDetRatio = rectDocDetRatio;
    }
}
